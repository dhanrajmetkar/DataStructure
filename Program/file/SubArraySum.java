import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class SubArraySum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 7, 5 };
        int sum = 12;
      System.out.println( printCursum(arr, sum));
         //bruitforce(arr, sum);
    }

    static ArrayList<Integer> printCursum(int arr[], int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int cursum = 0;
        int start=0;
        int end=-1;
        for (int i = 0; i < arr.length; i++) {
            cursum += arr[i];
            if(cursum-sum==0){
                start=0;
                end=i;
                break;
            }
            if(map.containsKey(cursum-sum))
            {
                start=map.get(cursum-sum)+1;
                end=i;
                break;
            }
            map.put(cursum, i);


        }
        // if(end==-1)
        // System.out.println("not found");
        // else
        // System.out.println("found");
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(start);
        ar.add(end);
        return ar;
    
    }
    static void bruitforce(int arr[],int sum)
    {
        // int start=0,end=0,cursum=0;
        // for (int i = 0; i < arr.length; i++) {
        //     cursum=arr[i];
        //     for (int j = i+1; j <= arr.length; j++) {
              
        //        if(cursum==sum)
        //        {
        //         start=i;
        //         end=j-1;
        //         return;
        //        }
            
        //        cursum+=arr[i]; 
        //     }
        // }
        int i,j;
        int n=arr.length;
        int currentSum;
        for (i = 0; i < n; i++) {
            currentSum = arr[i];
 
            // try all subarrays starting with 'i'
            for (j = i + 1; j <= n; j++) {
                if (currentSum == sum) {
                    int p = j - 1;
                    System.out.println(
                        "Sum found between indexes " + i
                        + " and " + p);
                    return;
                }
                if (currentSum > sum || j == n)
                    break;
                currentSum = currentSum + arr[j];
            }
        }
 


       // System.out.println(start+"  "+end);
    }
}

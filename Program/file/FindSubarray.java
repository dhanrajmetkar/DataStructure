

public class FindSubarray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,-2,5};
        
       System.out.println( Solution.findSubarray(arr, arr.length));

    }
}

class Solution {

    static int findSubarray(int a[], int n) {

        // code here
        int maxSum = 0;
      
        int cursum=0;
        for (int i = 0; i < a.length; i++) {
            cursum=cursum+a[i];
            if(cursum>maxSum)
            maxSum=cursum;
            if(cursum<0)
            cursum=0;
        }
        return maxSum;
    }

}

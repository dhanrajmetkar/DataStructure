package Arrays;

public class FindifSorted {
    public static void main(String[] args) {
        int arr[]={1,21,3,4,5};
        System.out.println(sort(arr,0));
    }
    private static boolean sort(int arr[],int i)
    {
        if(arr.length-1==i)
        {
            return true;
        }
        return arr[i]<arr[i+1]&&sort(arr,i+1);

    }
}

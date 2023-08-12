package LeetCode;

public class MaxSubarray {
    // Kadane's Algorithm
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Kadane(arr));
    }

    private static int Kadane(int[] arr) {
        int maxSum=Integer.MIN_VALUE;
        int curSum=0;
        for (int i = 0; i <arr.length ; i++) {
            curSum+=arr[i];
            if(curSum>maxSum)
                maxSum=curSum;
            else if(curSum<0)
                curSum=0;

        }
        return maxSum;
    }
}

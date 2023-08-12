package LeetCode;

public class BuyStock {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(profit(arr));
    }

    private static int profit(int[] arr) {
        int minsofar=arr[0];
        int profit=0;
        for (int i = 0; i <arr.length ; i++) {

            minsofar=Math.min(arr[i],minsofar);
            profit=Math.max(arr[i]-minsofar,profit);

        }
        return profit;
    }
}

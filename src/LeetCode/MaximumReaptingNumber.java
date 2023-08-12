package LeetCode;

import java.util.Arrays;

public class MaximumReaptingNumber {
    public static void main(String[] args) {
    int arr[]={2, 2, 1, 2};
        System.out.println(maxRepeating(arr,arr.length,3));
    }
    public static int maxRepeating(int[] arr, int n, int k) {
        // code here
        int fre[]=new int[k];
        Arrays.fill(fre,0);
        for (int i = 0; i < n; i++) {

            fre[arr[i]]++;
        }
        int max=0;
        for (int i = 0; i < fre.length; i++) {
           if(fre[i]>fre[max])
               max=i;
        }
        return max;

    }
}

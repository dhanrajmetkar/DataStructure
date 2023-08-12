package LeetCode;


import java.lang.reflect.Array;
import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int arr[] = {2,3,1};
        perm(arr);
        for (int i:
             arr) {
            System.out.print(i+" ");
        }
    }

    private static void perm(int[] arr) {
        int n=arr.length;
        int index = -1;
        for (int i = n-2; i >= 0; i--) {
            if (arr[i] < arr[i +1]) {
                index = i;
                break;
            }
        }
        if(index==-1)
        {
            reverse(arr,0,arr.length-1);
            return;
        }
        for (int i = n-1; i >0; i--) {
            if(arr[i]>arr[index])
            {
               int temp=arr[i];
               arr[i]=arr[index];
               arr[index]=temp;
            }
            break;

        }
        reverse(arr,index+1,arr.length-1);

    }

    private static void reverse(int[] arr, int s, int e) {
        while(s<e)
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }

}

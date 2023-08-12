package LeetCode;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int arr1[]={1,3,5};
        int arr2[]={2,4,6};
        int ans[]=mergeinRev(arr1,arr2,3,arr2.length);

        System.out.println(Arrays.toString(ans));
    }

    private static int[] merge(int[] arr1, int[] arr2, int length, int length1) {
        int mix[]=new int[length+length1];
        int i=0,j=0,k=0;
        while (i<length && j< length1)
        {
            if(arr1[i] < arr2[j])
            {
                mix[k]=arr1[i];
                i++;
            }
            else {
                mix[k]=arr2[j];
                j++;
            }
            k++;
        }
        while (i<length)
        {
            mix[k]=arr1[i];
            i++;
            k++;

        }
        while (j<length1)
        {
            mix[k]=arr2[j];
            j++;
            k++;
        }
//        for ( i = 0; i < arr1.length; i++) {
//            arr1[i]=mix[i];
//        }
//        for (int l = 0; l < arr1.length; l++) {
//            System.out.print(arr1[l]);
//        }
      return mix;
    }
    private static int[] mergeinRev(int[] arr1, int[] arr2, int length, int length1) {
        int mix[]=new int[length+length1];

        int i=0,j=0,k=mix.length-1;
        while (i<length && j< length1)
        {
            if(arr1[i] < arr2[j])
            {
                mix[k]=arr1[i];
                i++;
            }
            else {
                mix[k]=arr2[j];
                j++;
            }
            k--;
        }
        while (i<length)
        {
            mix[k]=arr1[i];
            i++;
            k--;

        }
        while (j<length1)
        {
            mix[k]=arr2[j];
            j++;
            k--;
        }
//        for ( i = 0; i < arr1.length; i++) {
//            arr1[i]=mix[i];
//        }
//        for (int l = 0; l < arr1.length; l++) {
//            System.out.print(arr1[l]);
//        }
        return mix;
    }


}

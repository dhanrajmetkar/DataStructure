package Arrays;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {325, 3344, 33, 12, 1};
        System.out.println(Arrays.toString(arr));
        int arr2[] = mergesort(arr);
        System.out.println(Arrays.toString(mergesort(arr2)));
    }

    private static int[] mergesort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = (arr.length) / 2;
        int left[] = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = mergesort((Arrays.copyOfRange(arr, mid, arr.length)));
        return mergetoge(left, right);
    }

    private static int[] mergetoge(int[] f, int[] s) {
        int mix[] = new int[f.length + s.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < f.length && j < s.length) {
            if (f[i] < s[i]) {
                mix[k] = f[i];
                i++;
            } else {
                mix[k] = s[j];
                j++;
            }
            k++;

        }
        while (i < f.length) {
            mix[k] = f[i];
            i++;
            k++;
        }
        while (j < s.length) {
            mix[k] = s[j];
            j++;
            k++;
        }
        return mix;
    }
}



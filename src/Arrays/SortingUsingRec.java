package Arrays;

import java.util.Arrays;

public class SortingUsingRec {
    public static void main(String[] args) {

        int arr[] = {5, 42, 121, 2, 28, 4};
        System.out.println(Arrays.toString(arr));
        bubb(arr, arr.length - 1, 0);
        //sele(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubb(int arr[], int row, int col) {
        if (row == 0) {
            return;

        }
        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;

            }
            bubb(arr, row, col + 1);
        } else bubb(arr, row - 1, 0);
    }

    static void sele(int arr[], int row, int col, int max) {
        if (row == 0) {
            return;

        }

        if (col < row) {
            if (arr[col] > arr[max]) {
                sele(arr, row, col + 1, col);
            } else {
                sele(arr, row, col + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            sele(arr, row - 1, 0, 0);
        }
    }
}


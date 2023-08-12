package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class SortArrayOf0and1 {
    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 1, 1, 1, 0, 0, 0};
        binSort(arr, arr.length);

    }

    static void binSort(int A[], int N) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
            } else map.put(A[i], 1);
        }
        int i = 0;
        int zero = map.get(0);
        while (zero > 0) {
            A[i] = 0;
            i++;
            zero--;
        }
        if(map.containsKey(1)) {
            int one = map.get(1);
            while (one > 0) {
                A[i] = 1;
                i++;
                one--;
            }
        }
        System.out.println(Arrays.toString(A));
        System.out.println(map);
    }
}

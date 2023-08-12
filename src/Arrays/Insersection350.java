package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class Insersection350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int k = 0;
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int j = 0; j < nums2.length; j++) {
            if (set1.contains(nums2[j])) {
                ans.add(nums2[j]);
                k++;
                set1.remove(nums2[j]);
            }
        }
        int arr[] = new int[ans.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int nums1[] = {4,9,5};
        int nums2[] = {9,4,9,8,4};
//        int nums1[] = {1, 2, 2, 1};
//        int nums2[] = {2, 2};

        int ans[] = intersect(nums1, nums2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

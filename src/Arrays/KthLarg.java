package Arrays;

import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class KthLarg {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(thirdMax(arr));
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            p.add(nums[i]);
            if (p.size() > k) {
                p.poll();
            }
        }
        return p.peek();


    }

    public static int thirdMax(int[] nums) {
        PriorityQueue<Integer> p = new PriorityQueue<>(new PriorityQueue<>());
        Set<Integer> st = new HashSet<>();
        for (int n : nums) {
            st.add(n);
        }
        if (st.size() < 3) return Collections.max(st);

        for (int ele : st) {
            p.add(ele);
            if (p.size() > 3) {
                p.poll();
            }
        }
        return p.peek();


    }
}

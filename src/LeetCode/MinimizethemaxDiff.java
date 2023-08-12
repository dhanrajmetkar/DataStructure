package LeetCode;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinimizethemaxDiff {
    public static void main(String[] args) {
        int[] arr={10,1,2,7,1,3};
        System.out.println(minimizeMax(arr,2));
    }
    public static int minimizeMax(int[] nums, int p) {
        PriorityQueue<Integer> q=new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            q.add(nums[i]);
        }
        int ans=0;
        for (int i = 0; i < p; i++) {
        if(q.isEmpty()) {
            int one = q.poll();
            int two = q.poll();
            ans = Math.max(Math.abs(one - two), ans);
        }
        }
        return ans;
    }
}

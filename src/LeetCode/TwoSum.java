package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15, 21, 4};
        int target = 25;
        System.out.println(Arrays.toString(hassum(arr, target)));

    }

    public static int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                {
                    if (nums[i] + nums[j] == target) {
                        ans[0] = i;
                        ans[1] = j;
                    }
                }
            }
        }
        return ans;
    }

    public static int[] hassum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }


}
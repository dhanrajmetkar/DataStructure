package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class SingleNo {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(nums[i])) {
                mp.put(nums[i], mp.get(nums[i]) + 1);
            } else mp.put(nums[i], 1);
        }
        System.out.println(mp);
        int value = 1;
        // iterate each entry of hashmap
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == value) {
                return entry.getKey();
            }
        }
        return -1;
    }


}


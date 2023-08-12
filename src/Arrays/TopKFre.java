package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFre {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int ans[] = topKFrequent(arr, 2);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] topKFrequent(int[] arr, int k) {
        int ans[] = new int[k];
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (pq.size() < k) {
                pq.add(entry.getValue());
            } else {
                pq.remove();
            }
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        for (int i = 0; i < k; i++) {
            if (!pq.isEmpty()) ans[i] = mp.get(pq.poll());
        }

        return ans;

    }
}

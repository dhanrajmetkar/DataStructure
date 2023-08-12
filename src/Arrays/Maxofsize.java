package Arrays;

import java.util.ArrayList;

public class Maxofsize {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(100);
        ar.add(200);
        ar.add(300);
        ar.add(400);
        System.out.println(maximumSumSubarray(3, ar, ar.size()));

    }

    static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N) {
        int j = 0;
        int sum = 0;
        long mx = 0;
        for (int i = 0; i < Arr.size(); i++) {
            while (j < Arr.size()) {
                sum = sum + Arr.get(i);
                if (j - i + 1 < K) {
                    j++;
                } else {
                    mx = Math.max(sum, mx);
                    i++;
                    j++;

                }
            }
        }
        return mx;
    }

}

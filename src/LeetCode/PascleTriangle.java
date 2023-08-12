package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascleTriangle {
    public static void main(String[] args) {
        // System.out.println(fact(5));
        //pascle(5,0);
        //System.out.println(ncr(5,2));
        //System.out.println(pascle(5,0));
        System.out.println(pascle(5));
    }

    static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    static int ncr(int n, int r) {
        return fact(n) / (fact(n - r) * fact(r));
    }

    static List<List<Integer>> pascle(int row) {

        //to print the addition of all the elements in the row
        // System.out.println(1<<row);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i < row; i++) {
            ans.add(generatelist(i));
        }
        return ans;
    }

    private static List<Integer> generatelist(int row) {
        int res = 1;
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        for (int i = 1; i < row; i++) {
            res = res * (row - i);
            res = res / i;
            ans.add(res);
        }
        return ans;
    }


}

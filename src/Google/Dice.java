package Google;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Dice {
    public static void main(String[] args) {
//        pri("",6);
        System.out.println(priret("", 4));
//        System.out.println(count("",5));

        Set ans = returArray("", 4, new TreeSet<>());
        System.out.println(ans);
    }

    static void pri(String p, int target) {
        if (target == 0) {
            System.out.print(p + " ");
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            pri(p + i, target - i);
        }
    }

    static ArrayList<String> priret(String p, int target) {
        if (target == 0) {
            ArrayList<String> n = new ArrayList<>();
            n.add(p);
            return n;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(priret(p + i, target - i));
        }
        return ans;
    }

    static Set<String> returArray(String p, int target, TreeSet<String> list) {
        if (target == 0) {
            list.add(p);
            return list;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(returArray(p + i, target - i, list));
        }
        return list;
    }

    static int count(String p, int target) {
        if (target == 0) {
            return 1;
        }
        int c = 0;
        for (int i = 1; i <= 6 && i <= target; i++) {
            c = c + count(p + i, target - i);
        }
        return c;
    }

}

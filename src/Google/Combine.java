package Google;

import java.util.ArrayList;

public class Combine {
    public static void main(String[] args) {

        String a = "ab";
//        int n = a.charAt(0) - '0';
//        String s = String.valueOf(n);
//        System.out.println(s);
//        System.out.println(combinations("", "12"));
//        System.out.println(count("", "12"));
        ArrayList<String> ans=combinations2("",a);
        System.out.println(ans);
        System.out.println(ans.size());
    }

    static boolean combinations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return false;
        }
        int digit = up.charAt(0) - '0';
        //this will convert the '2' into 2
        // refer  connversion
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) (i + 'a');
            combinations(p + ch, up.substring(1));
        }
        return false;
    }

    static ArrayList<String> combinations2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> st = new ArrayList<>();
            st.add(p);
            return st;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        //this will convert the '2' into 2
        // refer  conversion
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) (i + 'a');
            ans.addAll(combinations2(p + ch, up.substring(1)));
        }
        return ans;
    }

    static int count(String p, String up) {
        if (up.isEmpty()) {

            return 1;
        }
        int digit = up.charAt(0) - '0';
        int c = 0;
        //this will convert the '2' into 2
        // refer  connversion
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) (i + 'a');
            c = c + count(p + ch, up.substring(1));
        }
        return c;
    }
}


package String;

public class Longest14 {
    public static String longestCommonPrefix(String[] strs) {

        for (int i = 0; i < strs.length; i++) {
            char ans[] = new char[0];
            int x = 0;
            if (strs[i].charAt(i) == strs[i + 1].charAt(i + 1)) {
                ans[x] = strs[i].charAt(i);
                ++x;
            } else {
                return ans.toString();
            }
        }


        return "";
    }

    public static void main(String[] args) {
        String strs[] = {"flower", "flow", "flight"};
        String ans = longestCommonPrefix(strs);
        System.out.println(ans);

        System.out.println(strs[0].charAt(0));
    }
}

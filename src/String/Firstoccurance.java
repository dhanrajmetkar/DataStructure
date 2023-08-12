package String;

public class Firstoccurance {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(strStr(s, "ll"));
    }

    public static int strStr(String haystack, String needle) {
        int ans = 0;
        int i = 0;
        boolean flag = true;
        int x = 0;
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(x)) flag = true;
            if (haystack.charAt(i) == needle.charAt(x) && flag == true) {
                ans = i;
                flag = true;
                x++;
                if (x == needle.length()) {
                    x = 0;
                    return ans;
                }
            } else {
                flag = false;
            }
            i++;
        }


        return ans;
    }



}

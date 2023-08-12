package LeetCode;

public class Atoi {
    public static void main(String[] args) {
        String s = "9223372036854775808";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        long ans = 0;
        int neg = -1;
        int pos = -1;
        int i = 0;
        int temp = 0;
        int n = s.length();
        if (n == 0) return 0;
        if (s.charAt(0) == ' ' && s.length() == 1) return 0;
        while (i < n && s.charAt(i) == ' ') {
            temp++;
            i++;
        }
        if (temp == n) {
            return 0;
        }
        //   System.out.println(temp);
        if (s.charAt(i) == '+') {
            pos = 1;
            temp = temp + 1;
        }

        if (s.charAt(i) == '-') {
            neg = 1;
            temp = temp + 1;
        }


        while (temp < n && s.charAt(temp) >= '0' && s.charAt(temp) <= '9') {
            int num = s.charAt(temp) - '0';
            ans = ans * 10 + num;
            // System.out.println(ans);
            temp++;
        }

        if (neg == 1) {
            ans = -ans;
        }
        if (neg > 0 && pos > 0) return 0;
        // System.out.print(ans);
        int int_max = Integer.MAX_VALUE;
        int int_min = Integer.MIN_VALUE;
        if (ans > int_max) ans = int_max;
        if (ans < int_min) ans = int_min;
        return (int) ans;


    }

}

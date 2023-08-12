package LeetCode;

public class ReverseInt {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(reverse(n));
    }

    public static int reverse(int x) {
        int temp = x;
        boolean neg = false;
        if (x < 0) {
            neg = true;
        }

        long ans = 0;

        x = Math.abs(x);
        while (x > 0) {
            int rem = x % 10;
            x = x / 10;
            ans = ans * 10 + rem;

        }
        if (neg) {
            if (ans < 2147483647) return Integer.parseInt(String.valueOf(-ans));
            else return 0;
        } else {

            if (ans < 2147483647) return Integer.parseInt(String.valueOf(ans));
            else return 0;
        }
    }

    public static int rev(int x) {
        String str = String.valueOf(x);
        boolean negetive = false;
        StringBuilder reversedStr = new StringBuilder();
        long reverse = 0;

        if (x < 0) {
            negetive = true;
            str = str.substring(1);
        }

        for (int i = str.length() - 1; i >= 0; i--)
            reversedStr.append(str.charAt(i));

        reversedStr = negetive ? reversedStr.insert(0, '-') : reversedStr;

        reverse = Long.parseLong(reversedStr.toString(), 10);

        if (reverse <= Integer.MAX_VALUE && reverse >= Integer.MIN_VALUE)
            return Integer.valueOf(reversedStr.toString());
        else return 0;
    }


}

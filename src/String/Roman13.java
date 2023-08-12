package String;

public class Roman13 {
    public static int romanToInt(String s) {
        String a = "";
        return helper(s, 0);
    }

    public static int helper(String s, int add) {
        if (s.isEmpty()) {
            return add;
        }
        char ch = s.charAt(0);
        switch (ch) {
            case 'I':
                add = add + 1;
                break;
            case 'V':
                add = add + 5;
                break;
            case 'X':
                add = add + 10;
                break;
            case 'L':
                add = add + 50;
                break;
            case 'C':
                add = add + 100;
                break;
            case 'D':
                add = add + 500;
                break;
            case 'M':
                add = add + 1000;
                break;
            default:
                System.out.println("enter valid no");
                break;

        }
        int ans = helper(s.substring(1), add);

        return ans;
    }

    public static void main(String[] args) {
        String s = "MCM";
        System.out.println(romanToInt(s));
    }

}

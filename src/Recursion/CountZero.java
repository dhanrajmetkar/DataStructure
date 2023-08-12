package Recursion;


public class CountZero {
    public static void main(String[] args) {
        System.out.println(countz(1002100020));
    }

    private static int countz(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int count) {
        if (n / 10 == 0) {
            return count;
        }
        if (n % 10 == 0) return helper(n / 10, count + 1);
        else return helper(n / 10, count);

    }

    public static class Triangle {
        public static void main(String[] args) {
            printt(4, 0);
        }

        public static void printt(int row, int col) {
            if (row == col) {
                return;
            }
            for (int i = 0; i < row - col; i++) {
                System.out.print("* ");
            }
            System.out.println();
            printt(row, col + 1);
        }
    }

    public static class SkipChar {
        public static void main(String[] args) {
            SkipChar("", "aababsgraa", 'a');
        }

        public static void SkipChar(String p, String up, char skip) {
            if (up.isEmpty()) {
                System.out.println(p);
                return;
            }
            char ch = up.charAt(0);
            if (ch == skip) {
                SkipChar(p, up.substring(1), skip);
            } else {
                SkipChar(ch + p, up.substring(1), skip);
            }
            return;

        }
    }
}

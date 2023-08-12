package Recursion;

import java.util.ArrayList;

public class Duplicate {
    public static void main(String[] args) {
        //dup("","ab");
        // System.out.println(subSeqAscii("","xy"));
        skip("", "appfleapple");
    }

    private static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (up.startsWith("app") && !up.startsWith("apple")) {
            skip(p, up.substring(5));
        } else {
            skip(p + ch, up.substring(1));
        }


    }

    static ArrayList<String> dup(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return null;
        }
        char ch = up.charAt(0);
        dup(p + ch, up.substring(1));
        dup(p, up.substring(1));
        dup(p + (ch + 0), up.substring(1));

        return null;
    }

    static ArrayList<String> subSeqAscii(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> ar = new ArrayList<>();
            ar.add(p);
            return ar;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqAscii(p + ch, up.substring(1));
        ArrayList<String> right = subSeqAscii(p, up.substring(1));
        ArrayList<String> ascii = subSeqAscii(p + (ch + 0), up.substring(1));
        left.addAll(right);
        left.addAll(ascii);
        return left;

    }

    public static class Permutations {
        public static void main(String[] args) {
            ArrayList<String> ans = permute("123", "");
            System.out.println(ans.toString());
        }

        private static ArrayList<String> permute(String up, String p) {
            if (up.isEmpty()) {
                ArrayList<String> ans = new ArrayList<>();
                ans.add(p);
                return ans;
            }
            char ch = up.charAt(0);
            ArrayList<String> left = permute(up.substring(1), ch + p);
            ArrayList<String> right = permute(up.substring(1), p);

            left.addAll(right);
            return left;
        }
    }

    public static class Binary {
        public static void main(String[] args) {
            int[] arr = {2, 1, 3, 15, 4, 3, 5, 21, 4, 12, 41};
            for (int x : arr) {
                System.out.print(x + " ");

            }
            System.out.println();
            // binarySort(arr, 0);
            // selecton(arr,0);

            for (int x : arr) {
                System.out.print(x + " ");

            }

        }

        private static void selecton(int[] arr, int row) {
            if (row == arr.length - 1) {
                return;
            }
            int min = arr[row];
            int index = arr.length - 1;
            for (int i = row; i < arr.length; i++) {
                if (arr[i] <= min) {
                    min = arr[i];
                    index = i;
                }
            }
            int temp = arr[row];
            arr[row] = min;
            arr[index] = temp;
            selecton(arr, row + 1);

        }

        public static void binarySort(int[] arr, int row) {
            if (row == arr.length - 1) {
                return;
            }
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[row] > arr[row + 1]) {
                    int temp = arr[row];
                    arr[row] = arr[row + 1];
                    arr[row + 1] = temp;
                }
                binarySort(arr, row + 1);
            }

        }
    }
}

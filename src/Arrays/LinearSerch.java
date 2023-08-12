package Arrays;

public class LinearSerch {
    public static void main(String[] args) {
        int arr[] = {1, 5, 12, 13, 55, 111};
        int key = 111;
        System.out.println(linser(arr, key));
    }

    private static boolean linser(int[] arr, int key) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                flag = true;
            }

        }
        return flag;

    }
}

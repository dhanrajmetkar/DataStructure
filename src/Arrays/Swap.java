package Arrays;

public class Swap {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println(a + " " + b);
        swap(a, b);
        System.out.println();
    }

    private static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);


    }
}

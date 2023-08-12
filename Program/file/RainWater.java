public class RainWater {
  public static void main(String[] args) {
    int arr[] = { 7, 4, 0, 9 };

    System.out.println(RainWater.trap(arr));

  }

  public static int trap(int arr[]) {
    int ans = 0;
    int n = arr.length;
    int left[] = new int[n];
    int right[] = new int[n];
    left[0] = arr[0];
    for (int i = 1; i < right.length; i++) {
      left[i] = Math.max(arr[i], left[i - 1]);
    }
    right[n - 1] = arr[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      right[i] = Math.max(arr[i], right[i + 1]);

    }
    for (int i = 0; i < arr.length; i++) {
      ans = ans + Math.min(left[i], right[i]) - arr[i];
    }
    for (int i : left) {
      System.out.print(i + " ");
    }
    System.out.println();
    for (int i : right) {
      System.out.print(i + " ");
    }

    return ans;

  }

  // Driver method to test the above function

}

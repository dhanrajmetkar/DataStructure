package Arrays;

public class BinarySerch {
    public static void main(String[] args) {
        int arr[] = {2, 3, 41, 0};
        System.out.println(peakElement(arr));
    }

    private static int peakElement(int[] nums) {
        int l = 0;
        int h = nums.length - 1;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] < nums[mid + 1]) {
                h = mid - 1;
            } else if (nums[mid] > nums[mid + 1]) {
                l = mid;
            }
        }
        return l;
    }

    private static int[] searchRange(int[] nums, int i) {
        int ans[] = new int[2];
        ans[0] = lowerBound(nums, i);
        ans[1] = higherBound(nums, i);
        return ans;
    }

    private static int higherBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private static int lowerBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private static boolean binser(int[] arr, int key, int peak, int target) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = low + 1;
            } else if (arr[mid] == key) {
                return true;
            } else return false;
        }
        return false;

    }

    public static int binarySearch(int arr[], int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                return mid;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        return -1;
    }
}

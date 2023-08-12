package Arrays;

public class RBS {
    public static void main(String[] args) {
        int arr[] = {3, 5, 1};
        System.out.println(search(arr, 3));
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        System.out.println(pivot);
        if (pivot == -1) return binarySearch(nums, 0, nums.length - 1, target);
        if (target == nums[pivot]) return pivot;
        if (target >= nums[0]) return binarySearch(nums, 0, pivot - 1, target);
        if (target < nums[0]) return binarySearch(nums, pivot + 1, nums.length - 1, target);
        return -1;
    }

    private static int findPivot(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid < high && nums[mid] > nums[mid + 1]) return mid;
            if (mid > low && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[low] >= nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int arr[], int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        return -1;
    }
}

package LeetCode;

public class BInsearch {
    public static void main(String[] args) {
        int[] nums={1,3,5,6,10,11,33};
        int target=1;
        System.out.println(binarySearch(nums,0, nums.length-1,1));

    }
    public static int binarySearch(int arr[], int first, int last, int key){
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
              return mid;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
     return -1;
    }

}


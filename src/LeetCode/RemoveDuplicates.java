package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
    int arr[]={0,1,2,2,3,0,4,2};

        System.out.println(removeDuplicates(arr,2));
    }
    public static int removeDuplicates(int[] nums,int val) {
        int x=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[x]!=nums[i])
            {
                x++;
                nums[x]=nums[i];
            }

        }
        System.out.println(Arrays.toString(nums));
        return x+1;
    }
}

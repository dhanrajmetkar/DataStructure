package LeetCode;

import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,2};
        System.out.println(containsDuplicate(arr));
}
    static  public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> st=new HashSet<>();
        for (int arr:nums
             ) {
            if(!st.isEmpty() && st.contains(arr))
            {
                return true;
            }
            else {
                st.add(arr);
            }
        }
        return false;
    }
}

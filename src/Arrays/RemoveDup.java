package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDup {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        Set<Integer> st=new HashSet<>();
        for (int i:nums
             ) {

            st.add(i);
        }
        int ans=st.size();
        for (int i = 0; i <st.size(); i++) {
            for (int ele:st) {
                nums[i]= ele;
st.remove(ele);
break;

            }
        }
        System.out.println(Arrays.toString(nums));
        return ans;

    }
}

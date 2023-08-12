package LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class ReplaceGreatest {
    public static void main(String[] args) {
        int arr[]={17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
    public  static int[] replaceElements(int[] arr) {
        Stack<Integer> st=new Stack<Integer>();
        int n=arr.length;
        int ans[]=new int[n];
        for (int i = 0; i <n ; i++) {
            ans[i]=-1;
        }
        for (int i = n-1; i >=0 ; i--) {
            if(st.isEmpty())
            {
                st.push(-1);
            }
            ans[i]=st.peek();
            if(st.peek()<arr[i]) {
                st.pop();
                st.push(arr[i]);
            }
        }
        return ans;

    }
}

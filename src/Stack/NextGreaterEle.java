package Stack;

import java.util.Stack;

public class NextGreaterEle {
    public static void main(String[] args) {
        long arr[] = {1, 3, 2, 4};
        long ans[] = nextLargerElement(arr, arr.length);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }

    public static long[] nextLargerElement(long[] arr, int n) {
        Stack<Long> st=new Stack<Long>();
        long ans[]=new long[n];
        for (int i = 0; i <n ; i++) {
            ans[i]=-1;
        }
        for (int i = n-1; i >=0 ; i--) {
            while(!st.empty()&&st.peek() <= arr[i])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                ans[i]=st.peek();

            }
            st.push(arr[i]);

        }
        return ans;

    }
}

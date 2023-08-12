package LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class MinAreaHistogram {
    public static void main(String[] args) {
        int arr[]= {6,2,5,4,5,1,6};
        System.out.println(Arrays.toString(arr));
        System.out.println(largestRectangleArea(arr));
    }
    public static int largestRectangleArea(int[] heights) {
        int ans=0;
        int left[]=nextSmallerToLeft(heights);
        int right[]=nextSmallerToRight(heights);
        int curans=1;
        int temp=0;
        for (int i = 0; i < heights.length; i++) {
            temp=right[i]-left[i]-1;
            curans=heights[i]*temp;
            ans=Math.max(curans,ans);
        }
        return ans;

    }
    public static int[] nextSmallerToLeft(int arr[]) {
        // code here
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int ans[] =new int[n];
        Arrays.fill(ans,-1);

        for (int i = 0; i <n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }



    public static int[] nextSmallerToRight(int[] arr) {
        int n=arr.length;
        Stack<Integer> st=new Stack<Integer>();
        int ans[]=new int[n];
        Arrays.fill(ans,n);
        for (int i = n-1; i >=0 ; i--) {
            while(!st.empty()&&arr[st.peek()] >= arr[i])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                ans[i]=st.peek();

            }
            st.push(i);

        }
        return ans;

    }
}

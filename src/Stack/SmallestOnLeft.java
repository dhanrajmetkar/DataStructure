package Stack;

import java.util.*;

public class SmallestOnLeft {
    public static void main(String[] args) {
        int arr[] = {1,6,2};
       leftSmaller(arr.length,arr);
       // System.out.println(l);


    }
    static List leftSmaller(int n, int arr[])
    {
        //code here
        Stack<Integer> st=new Stack<>();
        int ans[] =new int[n];
        Arrays.fill(ans,-1);

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty()&&st.peek()>=arr[i])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                ans[i]=st.peek();
            }
            st.push(arr[i]);
        }

        List<Integer> lt=new ArrayList<>();
        for (int i = 0; i < ans.length; i++) {
            lt.add(arr[i]);

        }
        return lt ;

    }
}

package Stack;

import java.util.Arrays;
import java.util.Stack;
//https://practice.geeksforgeeks.org/problems/fab3dbbdce746976ba35c7b9b24afde40eae5a04/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
//same problem but you have to use pop in the code

public class NextSmaller {
    public static void main(String[] args) {
        int arr[] = {5 ,6, 2, 3, 1, 7};
        immediateSmaller(arr,arr.length);

    }

   public static void immediateSmaller(int arr[], int n) {
        // code here
       Stack<Integer> st=new Stack<>();
       int ans[]=new int[n];
       Arrays.fill(ans,-1);
       for (int i = n-1; i >=0 ; i--) {
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

       for (int i = 0; i < ans.length; i++) {
           System.out.print(ans[i]+" ");
       }

    }
}

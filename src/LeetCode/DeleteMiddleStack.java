package LeetCode;

import java.util.Stack;

public class DeleteMiddleStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        System.out.println(st);
        deleteMid(st,5);
        System.out.println(st);
    }
    public static void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        del(s,sizeOfStack,0);

    }

    private static void del(Stack<Integer> st, int e,int s) {
        if (st.size()==0||s==e)
            return;

        int temp=st.pop();
        del(st,e,s+1);
        if(s!=e/2)
        st.push(temp);
        return;
    }
}
package Stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(3);
        st.add(2);
        st.add(1);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    public static void reverse(Stack<Integer> st)
    {
        // add your code here
        if(st.size()==0)
        {
            return ;
        }
        int temp=st.pop();
        reverse(st);
        insert(temp,st);
        return ;
    }

    private static void insert(int ele, Stack<Integer> st) {
        if(st.size()==0)
        {
           st.push(ele);
           return;
        }
        int temp=st.pop();
        insert(ele,st);
        st.push(temp);
        return;

    }
}

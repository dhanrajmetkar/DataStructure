package Stack;

import java.util.Stack;

public class StackSort {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(3);
        st.add(2);
        st.add(1);
        st.add(5);
        st.add(41);
        System.out.println(st);
        sort(st);
        System.out.println(st);
    }
    public static void sort(Stack<Integer> st)
    {
        if(!st.isEmpty())
        {  int temp=st.pop();
            sort(st);
            insert(temp,st);
        }


    }
    private static void insert(int ele, Stack<Integer> st) {
        if(st.size()==0||st.peek() < ele)
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

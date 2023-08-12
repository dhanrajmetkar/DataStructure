package Stack;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(check(s));

    }

    private static boolean check(String s) {
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                st.push(ch);
            } else if (st.isEmpty()) {
                return false;
            } else {
                if (ch == '}' && !st.isEmpty()) {
                    if (st.peek() == '{')
                        st.pop();
                    else
                        return false;
                }
                if (ch == ']' && !st.isEmpty()) {
                    if (st.peek() == '[')
                        st.pop();
                }
                if (ch == ')' && !st.isEmpty()) {
                    if (st.peek() == '(')
                        st.pop();
                }

            }
        }
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}

package Stack;

import java.util.Stack;

public class MinEle921 {
    public static void main(String[] args) {
        String s = "()))((";
        System.out.println(minAddToMakeValid(s));
    }

    public static int minAddToMakeValid(String s) {

        Stack<Character> st = new Stack<Character>();
        int ans=0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                st.push(ch);
            } else if (st.isEmpty()) {
               ans++;
            } else {
                if (ch == '}' && !st.isEmpty()) {
                    if (st.peek() == '{') st.pop();
                    else ans++;
                }
                if (ch == ']' && !st.isEmpty()) {
                    if (st.peek() == '[') st.pop();
                    else ans++;
                }
                if (ch == ')' && !st.isEmpty()) {
                    if (st.peek() == '(') st.pop();
                    else ans++;
                }

            }
        }
      return ans+st.size();
    }


}

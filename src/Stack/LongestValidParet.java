package Stack;

import java.util.Stack;

public class LongestValidParet {
    public static void main(String[] args) {
        String s= "()(()";
        System.out.println(longPare(s));


    }

    private static int longPare(String s) {
       int left=0;
       int right=0;
       int max=0;
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)=='(')
                left++;
            else
                right++;
            if(left==right)
                max=Math.max(max,left*2);
            else if(right>left)
            {
                left=0;
                right=0;
            }

        }
        left=0;
        right=0;
        for (int i = s.length(); i >=0 ; i--) {
            if(s.charAt(i)=='(')
                left++;
            else
                right++;
            if(left==right)
                max=Math.max(max,left*2);
            else if(right<left)
            {
                left=0;
                right=0;
            }
        }

        return max;

    }


}

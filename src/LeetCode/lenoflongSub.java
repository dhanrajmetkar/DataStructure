package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class lenoflongSub {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        int x = -1;

        while (j < s.length()) {
            char ch = s.charAt(j);
            if (mp.containsKey(ch)) {
                mp.put(ch, mp.get(s.charAt(j)) + 1);
            } else {
                mp.put(ch, 1);
            }
            if (mp.size() == (j - i + 1)) {
                max = Math.max(max, (j - i + 1));
                j++;
            }
//            else if (mp.size() < (j - i + 1)) {
//
//                while (mp.size() < (j - i + 1)) {
//                    if (mp.get(s.charAt(i)) != null)
//                        mp.put(ch, mp.get(s.charAt(j)) - 1);
//                    if (mp.get(s.charAt(i)) != null)
//                        x = mp.get(s.charAt(j));
//                        if (x == 0) {
//                            mp.remove(ch);
//                            i++;
//                        }
//                }
//                j++;
            else if (mp.size() < j - i + 1) {
                while (mp.size() < j - i + 1) {
                    char c2 = s.charAt(i);
                    mp.put(c2, mp.get(c2) - 1);
                    if (mp.get(c2) == 0)
                        mp.remove(c2);
                    i++;
                }
                j++;
            }

        }




        return max;
}
}


package LeetCode;

public class Reverse_String {
    public static void main(String[] args) {
        String s="the sky is blue";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] words=s.split("\\s+");
        String revSting="";
        for (int i = words.length-1; i >0 ; i--) {
            revSting=revSting+words[i];
            revSting=revSting+" ";

        }
        return revSting.trim();


    }
}

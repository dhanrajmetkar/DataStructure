package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String cal="";
        int a=sc.nextInt();
        int b=sc.nextInt();
        for (int i = 0; i < a; i++) {
            cal=cal+'0';
        }
        for (int i = 0; i <b ; i++) {
            cal=cal+'1';

        }
        System.out.println(cal);

    ArrayList<String > ans =per("",cal,new ArrayList<>());
   // System.out.println(ans);
        boolean fi=false;
        for (int i = 0; i <ans.size() ; i++) {
           // System.out.print(ans.get(i)+" ");
            String st=ans.get(i);
           fi= palindrome(ans.get(i),0,st.length()-1);
           if(fi)
           {
               System.out.println("Yes");
               break;
           }
        }
        if(!fi)
        System.out.println("No");
    }
    static ArrayList<String> per(String p, String up, ArrayList<String> list){
        if(up.isEmpty())
        {
         ArrayList<String> list1=new ArrayList<>();
         list1.add(p);
         return list1;

        }
        ArrayList<String> ans=new ArrayList<>();
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(per(f+ch+s,up.substring(1),list));
        }
        return ans;

    }
    static boolean palindrome(String s,int start,int end){
        if(start>=end)
        {
            return true;
        }
        if(s.charAt(start)!=s.charAt(end))
        {
            return false;
        }
        return palindrome(s,start+1,end-1);

    }


}

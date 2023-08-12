package Recursion;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(permute_countarg("","abc",0));
    }
    static void permutate(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String start=p.substring(0,i);
            String end=p.substring(i,p.length());
            permutate(start+ch+end,up.substring(1));

        }

    }
    static ArrayList<String> permutateArray(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String > list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for (int i = 0; i <=p.length() ; i++) {
            String start=p.substring(0,i);
            String end=p.substring(i,p.length());
              ans.addAll(permutateArray(start+ch+end,up.substring(1)));

        }
        return ans;
    }
    static int permute_count(String p, String up)
    {
        if(up.isEmpty())
        {
            return 1;
        }

        char ch=up.charAt(0);
        int count=0;

        for (int i = 0; i <=p.length() ; i++) {
            String start=p.substring(0,i);
            String end=p.substring(i,p.length());
            count+=permute_count(start+ch+end,up.substring(1));
        }
        return count;
    }
    static int permute_countarg(String p, String up,int count)
    {
        if(up.isEmpty())
        {
            return count;
        }

        char ch=up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String start=p.substring(0,i);
            String end=p.substring(i,p.length());
           permute_countarg(start+ch+end,up.substring(1),count+1);
        }
        return count;
    }
}

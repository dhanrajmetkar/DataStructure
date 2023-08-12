package BackTracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        //System.out.println(show(3,3));
      // path("",3,3);
        //System.out.println(pathArray("",3,3));
        //System.out.println(diagonally(3,3));
       // System.out.println(river(3,3));
        boolean arr[][]=
        {
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        pathrestriction("",arr,0,0);

    }

    private static void pathrestriction(String p, boolean[][] arr, int r, int c) {
        if(r==arr.length-1 && c==arr[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(!arr[r][c])
        {
            return;
        }
        if(r<arr.length-1)
        {
            pathrestriction(p+'d',arr,r+1,c);
        }
        if(c<arr.length-1)
        {
            pathrestriction(p+'r',arr,r,c+1);
        }

    }

    private static int diagonally(int r, int c) {
        if(r==1||c==1)
            return 1;
        int count=0;
        count+=diagonally(r-1,c)+diagonally(r,c-1)+diagonally(r-1,c-1);
        return count;
    }
    private static int river(int r, int c) {

        if (r==2&&c==2)
            return 0;
        if(r==1||c==1)
            return 1;

        int count=0;
        count+=river(r-1,c)+river(r,c-1);
        return count;
    }

    static  int show(int r,int c)
    {
        if(r==1 ||c==1)
    {
        return 1;
    }
    int count=0;
        count+=show(r-1,c)+show(r,c-1);
    return count;
   }
   static void path(String p, int r, int c)
   {
       if(r==1&&c==1)
       {
           System.out.println(p);
       }
       if(r>1)
       path(p + 'd', r - 1, c);
       if(c>1)
       path(p+'r',r,c-1);
   }
    static ArrayList<String > pathArray(String p, int r, int c)
    {
        if(r==1&&c==1)
        {
           ArrayList<String > list=new ArrayList<>();
           list.add(p);
           return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(r>1)
          ans .addAll(pathArray(p + 'd', r - 1, c));
        if(c>1)
           ans.addAll( pathArray(p+'r',r,c-1));
    return  ans;
    }
}

package Recursion;

public class ReduceToZero {
    public static void main(String[] args) {
        System.out.println(steps(8));
    }

    private static int steps(int i) {
        return helper(i,0);
    }
    private static int helper(int n,int step)
    {
        if(n==0){
            return step;
        }
        if(n%2==0)
        {
            return helper(n/2,step+1);
        }
        else
        {
            return helper(n-1,step+1);
        }
    }
}

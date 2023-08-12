package Recursion;

public class Reverse {
    static int sum=0;
    public static void main(String[] args) {
        int n=1234;
        System.out.println(rev2(n));

    }

    private static int rev2(int n) {
        int digit= (int) (Math.log10(n)+1);
        return helper(n,digit);
    }

    private static int helper(int n, int digit) {
        if(n/10==0)
        {
            return 1;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10,digit-1))+helper(n/10,digit-1);
    }
    
    private static void rev(int n) {
        if(n==0)
        {
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev(n/10);

    }
    private boolean palindrome(int n)
    {
        return n==rev2(n);
    }
}

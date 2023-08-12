import java.util.*;

class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
       
       String str=sc.nextLine();
       char ch=str.charAt(0);
       System.out.println(ch=='c');
      
       sc.close();
    }
}
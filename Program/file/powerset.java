import javax.xml.stream.events.StartDocument;

class powerset{
    public static void main(String[] args) {
        String s="abc";
        int i=0;
        String cur="";

printele(s, i, cur);
        
    }
    static void printele(String st,int i,String cur)
    {
        if(st.length()==i)
        {
            System.out.println(cur);
            return ;
        }
        printele(st, i+1, cur+st.charAt(i));;
        printele(st, i+1, cur);
    }
}
public class triangle {
    public static void main(String[] args) {
        int arr[]={5,3,1,2,4};
        name(4,0);
    System.out.println(fun(arr,arr.length-1,0));
      
    }
    public static void name(int r,int col) {
        if(r==0)
        return;
        if(col<r)
        {
            System.out.print("*");
            name(r,col+1);
        }
        else{
        System.out.println();
        name(r-1,0);
        }
        public static int  fun(int arr[],int r,int col) {
            if(r==0)
            return arr;
            if(col<r)
            {
              if(arr[col]>arr[col+1])
              {
                int temp=arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
                
                return fun(arr,r,col+1);
              }

            }
            else{
            return fun(arr,r-1,0);
            
        }
    }
}

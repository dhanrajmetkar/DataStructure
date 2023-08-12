 import java.util.*;
 class Selection {
    public static void main(String[] args) {
        int arr[]={3,5,2,2,7,1};

        
        //fun(arr,arr.length-1,0,0);
        // System.out.println(Arrays.toString(arr));
        tri(4,0);// 
    
    }
    // static void fun(int arr[],int r,int c,int max)
    // {
    //     if(r==0);
    //     {
    //         return ;
    //     }
    //     if(c<r)
    //     {
    //     if(arr[c]>arr[max])
    //     {
    //        fun(arr,r,c+1,c);
    //     }
    //     else
    //     fun(arr,r-1,0,max);
    // }
    // else
    //    {
    //     int temp=arr[max];
    //     arr[max]=arr[r-1];
    //     arr[r-1]=temp;
    //     fun(arr,r-1,0,0);
    //    }
    // }
    static void tri(int r,int c)
    {
        if(r==0)
        return;
        small(r,c);
    }
    static int small(int r,c){
      
        if(c<r)
        {
            
          return tri(r,c+1); 
        }
        else
        {
           return tri (r-1,0);

        }
}

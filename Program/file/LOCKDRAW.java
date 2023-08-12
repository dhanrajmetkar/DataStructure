/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int arr[]=new int[3];
		    for(int i=0;i<=2;i++)
		    {
		    arr[i]= sc.nextInt();
		    }
		    for(int i=0;i<1;i++)
		    {
		        int k=i;
		        for(int j=i+1;j<2;j++)
		        {
		            if(arr[j]<arr[k])
		            k=j;
		            if(k!=i)
		            {
		                int temp=arr[i];
		                arr[i]=arr[k];
		                arr[k]=temp;
		            }
		        }
		    }
		    if((arr[0]+arr[1])==arr[2])
		    System.out.println("yes");
		    else
		     System.out.println("No");
		   
		}
		
	sc.close();
}
	
}

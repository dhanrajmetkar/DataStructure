#include<stdio.h>
#include<conio.h>
void printArr(int n,int arr[]);
void selectionSort(int n,int arr[]);

void main()
{

    printf("This is Selection Sort \n ");
 int arr[50],n,j,i;
 printf("Enter the no of element ");
 scanf("%d",&n);
 for(i=0;i<n;i++)
 {

     scanf("%d",&arr[i]);

 }
 printf("\n Numbers Before Sorting\n");

 printArr(n,arr);
selectionSort(n,arr);

printf("\n Numbers After Sorting\n");

 printArr(n,arr);


}
void printArr(int n,int arr[])
{

int i;
  for(i=0;i<n;i++)
 {

     printf("%d \n",arr[i]);

 }
}
void selectionSort(int n,int arr[])
{
    int i,j,k,temp;
     for(i=0;i<n-1;i++)
   {
    k=i;
      for(j=i+1;j<n;j++)
   {
       if(arr[j]<arr[k]){k=j;}

        if (k!=i)
       {

           temp=arr[i];
           arr[i]=arr[k];
           arr[k]=temp;

       }



    }


 }

}


#include<stdio.h>
#include<conio.h>
void printArr(int n,int arr[]);
void insertionSort(int n,int arr[]);

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
insertionSort(n,arr);

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
void insertionSort(int n,int arr[])
{
    int i,j,k,temp;
     for(i=1;i<n;i++)
   {
    temp=arr[i];
      for(j=i-1;j>=0&&arr[j]>temp;j--)
   {

    arr[j+1]=arr[j];

    }
arr[j+1]=temp;

 }

}


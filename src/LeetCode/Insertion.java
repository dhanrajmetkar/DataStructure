package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Insertion {
    public static void main(String[] args) {
//        int arr[]={4,5,9};
//        int arr2[]={9,4,9,8,4};
        int arr[]={1,2,2,1};
        int arr2[]={2,2};
        insertion(arr,arr2);

    }
    static void insertion(int[] arr1,int[] arr2)
    {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for (int ele:arr1)
        {
            set.add(ele);
        }

        for (int j = 0; j <arr2.length ; j++) {
            if(set.contains(arr2[j]))
            {
                list.add(arr2[j]);
                set.remove(arr2[j]);
            }

        }

//        System.out.println(list);
//        System.out.println(set);
//        Object[] ans =list.toArray();
//        System.out.println(Arrays.toString(ans));
        System.out.println(list);
int arr[]=new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i]=list.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.function.IntUnaryOperator;

import javafx.scene.layout.Priority;

public class Largestk {
    public static void main(String[] args) {
        int arr[]={7 ,10, 4, 3 ,20, 15,};

       Largestk.prin(arr,3); 
    }
    static void prin(int[] arr,int k)
    {
       k++;
        PriorityQueue pq=new PriorityQueue<>();
        for (int  i = 0; i <k; i++) {
            pq.add(arr[i]);
        } 

        Iterator<Integer> it= pq.iterator();
        while(it.hasNext())
        System.out.print(it.next()+" ");
       // System.out.println(pq);
        System.out.println();
      for (Object object : arr) {
        System.out.print(object+" ");
      }
      System.out.println();
        for (int i = k; i < arr.length; i++) {
            pq.poll();
            pq.add(arr[i]);
        }
        System.out.println(pq.peek());
        
    }
}

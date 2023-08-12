import java.util.*;

public class Stock {
    public static void main(String[] args) {
        Problem113 obj = new Problem113();

        int arr[] = { 3,3,5,0,0,3,1,4 };

        System.out.println(obj.maxProfit(arr));

    }
}

class Problem111 {

    void printprice(int arr[]) {

        int i;
        int max = 0;
        for (i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (max < arr[j] - arr[i])
                    max = arr[j] - arr[i];
            }
        }
        System.out.println(max);
        int minPrice = Integer.MAX_VALUE;
        int price = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < minPrice)
                minPrice = arr[i];
            else if (arr[i] - minPrice > price)
                price = arr[i] - minPrice;
        }
        System.out.println(price);
    }
}

// stock buy and sell for maximum profit
class Problem112 {
    public int maxProfit(int[] prices) {
        int price = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                price = price + (prices[i] - prices[i - 1]);
            }
        }
        return price;

    }
}

class Problem113 {
    public int maxProfit(int[] prices) {
        ArrayList<Integer> ar = new ArrayList<>();
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                ar.add(profit + (prices[i] - prices[i - 1]));
            }
        }
        Collections.sort(ar);
        int n = ar.size();
       return ar.get(n-1)+ar.get(n-2);
        // System.out.println(sol);
        // System.out.println(ar);
        // return n;

    }
}

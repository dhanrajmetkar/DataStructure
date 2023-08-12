package LeetCode;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import static java.sql.Types.INTEGER;

public class MaxSubArrray {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
               System.out.println(maxSubArray(arr));
    }
    static  int maxSubArray(int[] arr) {
        int cursum=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            cursum+=arr[i];
            if(cursum > max)
            {
                max=cursum;
            }
            if(cursum < 0)
            {
                cursum=0;
            }

        }
        return max;
    }
}

package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int arr[]={11,11,11};
        System.out.println(subDupLicate(arr));
    }

    private static List<List<Integer>> subS(int[] nums) {

            List<List<Integer>> outer=new ArrayList<>();
            outer.add(new ArrayList<>());
            for (int num:nums) {
                int n=outer.size();
                for (int j = 0; j < n ; j++) {
                    List<Integer> inner=new ArrayList<>(outer.get(j));
                    inner.add(num);
                    outer.add(inner);
                }
            }
            return outer;
    }
    private static List<Integer> subSum(int[] nums) {

        List<List<Integer>> outer=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num:nums) {
            int n=outer.size();

            for (int j = 0; j < n ; j++) {
                List<Integer> inner=new ArrayList<>(outer.get(j));
               if(!inner.contains(num))
                   inner.add(num);
                outer.add(inner);
            }

        }
       // System.out.println(outer);
        for (int i = 0; i < outer.size(); i++) {
            for (int j = 0; j < outer.get(i).size(); j++) {
                System.out.print(outer.get(i).get(j) + " ");
            }
            System.out.println();
        }

        return ans;
        }
    private static List<List<Integer>> subDupLicate(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start, end = 0;
        for (int i = 0; i < nums.length; i++) {
            {
                start = 0;
                if (i > 0 && nums[i] == nums[i - 1]) {
                    start = end + 1;
                }
                end = outer.size()-1;
                int n = outer.size();
                for (int j = start; j < n; j++) {
                    List<Integer> inner = new ArrayList<>(outer.get(j));
                    inner.add(nums[i]);
                    outer.add(inner);
                }
            }

        }return outer;

    }
    }


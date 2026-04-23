package com.learning.git.PracticeGit.list;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
 
        List<Integer> nums=new ArrayList<>();
        nums.add(2);
        nums.add(10);
        productOfNumsList(nums);

       System.out.println( sumOfListElements(nums));
       System.out.println(sumOfListElementsStream(nums));

        
    }

    // Find the Sum of All Elements in a List
    public static int sumOfListElements(List<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }
    //sum of list elements by stream
    public static int sumOfListElementsStream(List<Integer> nums){
        if(nums==null) return 0;
        return nums.stream().mapToInt(x -> x.intValue()).sum();
    }

    // Product of nUMBERS

    public static void productOfNumsList(List<Integer> nums){
        int result=1;

        for(int i : nums){
            result*=i;
        }

        System.out.println(result);
    }
}

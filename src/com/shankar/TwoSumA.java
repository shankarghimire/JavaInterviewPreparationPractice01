package com.shankar;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoSumA {
    public static void main(String[] args) {
        int[] nums={4,2,6,5,7,9,10};
        int sum   = 13;
        System.out.println(Arrays.toString(nums));
        System.out.println(sum);

//        System.out.println(isSumAvailable(nums, sum));
        System.out.println(isSumAvailable2(nums, sum));
    }
    //Using Brute-Force Approach
    public static  boolean isSumAvailable(int[] nums, int target){
        //boolean result = true;
        int sum = 0;
        for(int i  = 0; i < nums.length; i++){
            for(int j = i+ 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return  true;
                }
            }
        }
        return false;
    }
    //Using HashSet
    public  static boolean isSumAvailable2(int[] nums, int target){
       Set<Integer> hSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        System.out.println(hSet);
        for(Integer a : hSet){
            int nextNumber = target - a;
            if (hSet.contains(nextNumber)){
                return true;
            }
        }
       return  false;

    }
}

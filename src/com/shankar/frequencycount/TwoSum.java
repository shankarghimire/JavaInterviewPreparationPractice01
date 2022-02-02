package com.shankar.frequencycount;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Example 1: Two Sum
Given an array of integers, and a target value determine if there are two integers that add to the sum.

Input: [4,2,6,5,7,9,10], 13

Output: true
Constraint:
Time: O(N)
Space : O(N)
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {4,2,6,5,7,9,10};
        int target = 13;
        System.out.println("Give Array : " + Arrays.toString(arr));
        System.out.println("Target : " + target);
        System.out.println(twoSum(arr, target));
    }
    public  static  boolean twoSum(int[] arr, int target){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
            int current = target - arr[i];
            if(set.contains(current)){
                return  true;
            }
        }
        return  false;
    }
}

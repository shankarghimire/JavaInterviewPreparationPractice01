package com.shankar.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

/*
Write a function 'canSum(targetSum, numbers)' that takes in a
target and an array of numbers as arguments.
the function should return a boolean indicating whether or not it
is possible to generate the targetSum using numbers form the array.
You may use an element of the array as many times as needed.
You may assume that all input numbers are non-negative
Example 1:
Array: [5, 3, 4, 7]
TargtSum = 7
Output: True

Example 2:
Array: [2, 4]
TargetSum = 7
Output: False
 */
public class CanSumArray2 {
    //Using Memoization
    Map<Integer,Boolean> map = new HashMap<>();
    public boolean canSum(int targetSum, int[] arr){
        //Checking Memoization
        if(map.containsKey(targetSum)){
            return map.get(targetSum);
        }
        //base case
        if(targetSum == 0){
            return  true;
        }
        if(targetSum < 0){
            return  false;
        }
        //recursive case
        for(int num: arr){
            //System.out.println(num);
            int remainder = targetSum - num;
            if(canSum(remainder, arr) == true){
                map.put(targetSum, true);
                return true;
            }
        }
        map.put(targetSum, false);
        return false;
    }
    public static void main(String[] args) {
        CanSumArray2 obj = new CanSumArray2();
        System.out.println(obj.canSum(7, new int[]{2,3}));
        obj = new CanSumArray2();
        System.out.println(obj.canSum(7, new int[]{5, 3, 4, 7}));
        obj = new CanSumArray2();
        System.out.println(obj.canSum(7, new int[]{2,4}));
        long start = System.currentTimeMillis();
        obj = new CanSumArray2();
        System.out.println(obj.canSum(300, new int[]{7,14}));
        long end = System.currentTimeMillis();
        double elaspedTime = (end- start)/ 1000.0;
        System.out.println("Elasped Time: " + elaspedTime);
    }
}

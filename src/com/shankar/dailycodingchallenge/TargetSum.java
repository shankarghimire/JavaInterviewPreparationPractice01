package com.shankar.dailycodingchallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17
 */
public class TargetSum {

    public boolean findTargetSum(int targetSum, int[] arr){
        if(arr.length == 0){
            return  false;
        }
        Set<Integer> set = new HashSet<>();
        for(int num: arr){
            set.add(num);
            int nextNum = targetSum - num;
            if(set.contains(nextNum)){
                return  true;
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        TargetSum ts = new TargetSum();
        System.out.println(ts.findTargetSum(17, new int[]{10, 15, 3, 7}));

    }
}

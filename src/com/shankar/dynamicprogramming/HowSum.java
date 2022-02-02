package com.shankar.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

/*
Write a function 'howSum(targetSum, numbers)' that thakes in a
targetSum and an array of numbers as arguments.
The function should return an array containing any combination
of elements that add up to exactly the targetsum. If there is no
combination that adds up to the targetSum, then return null.

If there are multiple combinations possible, you may return any single one.

Example 1:
howSum(7 [5, 3, 4, 7]) => [3, 4] or [7] any one of them

Example 2:
howSum(8, [2, 3, 5]) => [2,2,2,2] or [3,5]

Example 3:
howSum(7, [2,4]) => null

Example 4:
howSum(0,[1, 2, 3]) =>[]

 */
//Using basic recursion
public class HowSum {
    List<Integer> list = new ArrayList<>();
    public List<Integer> howSum(int targetSum, int[] arr){

        //Base case
        if(targetSum == 0){
            list = new ArrayList<>();
            return   list;
        }
        if(targetSum  < 0){
            return  null;
        }
        //Recursive case
        for(int num : arr){
            int remainder = targetSum - num;
            list = howSum(remainder, arr);
            if(list != null){
                list.add(num);
                return list;
            }
        }
        return  null;
    }
    public static void main(String[] args) {
        HowSum obj ;
        obj = new HowSum();
        System.out.println(obj.howSum(7, new int[]{2,3}));

        obj = new HowSum();
        System.out.println(obj.howSum(7, new int[]{5, 3, 4, 7}));

        obj = new HowSum();
        System.out.println(obj.howSum(7, new int[]{2, 4}));

        obj = new HowSum();
        System.out.println(obj.howSum(8, new int[]{2, 3, 5}));

        obj = new HowSum();
        long start = System.currentTimeMillis();
        System.out.println(obj.howSum(300, new int[]{7, 14}));
        long end = System.currentTimeMillis();
        double elaspedTiime = (end - start) / 1000.0;
        System.out.println("Elasped Time: " + elaspedTiime);


    }
}

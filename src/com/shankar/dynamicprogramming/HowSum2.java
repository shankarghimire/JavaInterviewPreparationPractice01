package com.shankar.dynamicprogramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class HowSum2 {
    Map<Integer, List<Integer>> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    public List<Integer> howSum(int targetSum, int[] arr){
        //checking map
        if(map.containsKey(targetSum)){
            return  map.get(targetSum);
        }
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
                map.put(targetSum, list);
                return map.get(targetSum);
            }
        }
        map.put(targetSum, null);
        return  null;
    }
    public static void main(String[] args) {
        HowSum2 obj ;
        obj = new HowSum2();
        System.out.println(obj.howSum(7, new int[]{2,3}));

        obj = new HowSum2();
        System.out.println(obj.howSum(7, new int[]{5, 3, 4, 7}));

        obj = new HowSum2();
        System.out.println(obj.howSum(7, new int[]{2, 4}));

        obj = new HowSum2();
        System.out.println(obj.howSum(8, new int[]{2, 3, 5}));

        obj = new HowSum2();
        long start = System.currentTimeMillis();
        System.out.println(obj.howSum(300, new int[]{7, 14}));
        long end = System.currentTimeMillis();
        double elaspedTiime = (end - start) / 1000.0;
        System.out.println("Elasped Time: " + elaspedTiime);

    }
}

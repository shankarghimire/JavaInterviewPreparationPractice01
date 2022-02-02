package com.shankar.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

/*
Write a function 'bestSum(targetSum, numbers)' that takes in a targetSum and an array of numbers
as arguments.

The function should return an array containing the shortest combination
of numbers that add up to exactly the targetSum.

If there is a tie for the shortest combination, you many return any
one of them shortest.

Example 1:
bestSum(7, [5, 3, 4, 7]) => [3,4], [7]
                        output : [7]
Example 2:
bestSum(8,[2,3,5]) =>
                [2,2,2,2]
                [2,3,3]
                [3,5]
           Output: [3,5]




 */
public class BestSum {
    List<Integer> list;// = new ArrayList<>();
    List<Integer> combination = new ArrayList<>();
    List<Integer> shortestCombination = new ArrayList<>();
    public List<Integer> bestSum(int targetSum, int[]arr){
        //Base case
        if( targetSum == 0){
            list = new ArrayList<>();
            return  list;
        }
        if(targetSum < 0){
            return  null;
        }

        //List<Integer> shortestCombination = null;
        //Recursive case
        shortestCombination = null;
        for(int num: arr){
            int remainder = targetSum - num;
            list = bestSum(remainder, arr);
            if(list != null) {
                list.add(num);
                //combination = new ArrayList<>();
                combination = list;
                //System.out.println(list);
                //combination.add( num);
//                System.out.println(combination);
                if ( shortestCombination == null || combination.size() < shortestCombination.size()) {
                    shortestCombination = combination;
                    //System.out.println(combination);
                }
                System.out.println(shortestCombination);
            }
        }
        return  shortestCombination;
    }
    public static void main(String[] args) {
        BestSum obj ;
//        obj = new BestSum();
//        System.out.println(obj.bestSum(7, new int[]{5, 3, 4, 7})); // [7]
//
//        obj = new BestSum();
//        System.out.println(obj.bestSum(8, new int[]{2, 3, 5})); //[5,3]
//
        obj = new BestSum();
        System.out.println(obj.bestSum(8, new int[]{1, 4, 5})); //[4,4]

        obj = new BestSum();
        long start = System.currentTimeMillis();
        //System.out.println(obj.bestSum(100, new int[]{1, 2, 5, 25})); //[25, 25, 25, 25]
        long end = System.currentTimeMillis();
        double elaspedTiime = (end - start) / 1000.0;
        System.out.println("Elasped Time: " + elaspedTiime);


    }
}

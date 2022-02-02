package com.shankar.dynamicprogramming;

import java.util.HashMap;
import java.util.HashSet;

/*
Using memoization /top-down dynamic approach
 */
public class FibSeriesDemo2 {
    private HashMap<Integer, Long> hash = new HashMap<>();
    public  long getFibSeries(int n){
        if( n == 0 || n == 1 ){
             return  1;
        }
        if(hash.containsKey(n)){
            return hash.get(n);
        }
        long result = getFibSeries(n-1) + getFibSeries(n-2);
        hash.put(n,result);
        return  result;
    }
    public static void main(String[] args) {
        FibSeriesDemo2 fib2  = new FibSeriesDemo2();
        int n = 6;
        long start = System.currentTimeMillis();
        System.out.println("Fib Seris at " + n +" th place is : " + fib2.getFibSeries(n));
        long end = System.currentTimeMillis();
        double duration = (end- start) / 1000.0;
        System.out.println("Total Elasped Time: " + duration);
    }
}

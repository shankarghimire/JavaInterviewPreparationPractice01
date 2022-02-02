package com.shankar.dynamicprogramming;

import java.time.Duration;
import java.time.Instant;

/*
Using normal recursion
 */
public class FibSeriesDemo1 {
    public long counter;
    public long getFibSeries(long n){
        counter++;
        if(n == 0){
            return  1;
        }
        if(n == 1){
            return  1;
        }
        return getFibSeries(n-1) + getFibSeries(n-2);
    }
    public static void main(String[] args) {
        FibSeriesDemo1 fib1 = new FibSeriesDemo1();
        long start = System.currentTimeMillis();
        System.out.println(fib1.getFibSeries(50));
        long end = System.currentTimeMillis();
        double elapsedTime = (end - start ) / 1000.0;
        System.out.println("Elasped time: " + elapsedTime);
    }
}

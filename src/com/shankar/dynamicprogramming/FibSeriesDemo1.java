package com.shankar.dynamicprogramming;

import java.time.Duration;
import java.time.Instant;

public class FibSeriesDemo1 {
    public long counter;
    public long getFibSeries(long n){
        counter++;
        if(n == 0){
//            System.out.println("Counter: " + counter);
            return  1;
        }
        if(n == 1){
//            System.out.println("Counter: " + counter);
            return  1;
        }
        //System.out.println("Counter: " + counter);
        return getFibSeries(n-1) + getFibSeries(n-2);
    }
    public static void main(String[] args) {
        FibSeriesDemo1 fib1 = new FibSeriesDemo1();
        //long start = System.nanoTime();
        Instant start = Instant.now();
        System.out.println(fib1.getFibSeries(50));
        //long elaspedTime = System.nanoTime() - start;
        Instant end = Instant.now();
        Duration elaspedtime = Duration.between(start, end);
        System.out.println("Elasped time: " + elaspedtime);
        //System.out.println("Elasped Time: " + elaspedTime);
        //System.out.println("counter: "  + fib1.counter);
    }
}

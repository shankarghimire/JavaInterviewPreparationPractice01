package com.shankar.dynamicprogramming;

public class FibSeriesDemo3 {
    public long getFibonacciSeries(int n){
        long a = 1;
        long b = 1;
        long c =0 ;
        for(int i = 2; i <= n; i++){
            c = a + b;
            a  = b;
            b = c;
        }
        return  c;
    }
    public static void main(String[] args) {
        FibSeriesDemo3 fib = new FibSeriesDemo3();
        int n = 100;
        long start = System.currentTimeMillis();
        System.out.println("FibSeries at " + n +" th place is : " + fib.getFibonacciSeries(n) );
        long end = System.currentTimeMillis();
        double duration = (end - start) / 1000.0;
        System.out.println("Total time : " + duration);
    }

}

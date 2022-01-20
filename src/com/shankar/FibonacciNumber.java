package com.shankar;

public class FibonacciNumber {
    /*
        0   1   2   3   4   5   6   7   8   9
        1   1   2   3   5   8   13  21  34  55
     */
    public static void main(String[] args) {
        int  n = 6;
        System.out.println();
        int result = fibonacciNumber(n);
        System.out.println(result);

    }
    public  static  int fibonacciNumber(int n){
        System.out.print(n +" ");
        if( n == 0 || n == 1){
            return 1;
        }
        return fibonacciNumber(n-1) + fibonacciNumber(n-2);
    }
}

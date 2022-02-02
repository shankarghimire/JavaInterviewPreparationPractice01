package com.shankar.dynamicprogramming;

import java.util.Arrays;

public class LatticePath {
    private static long[][] cache;
    public  static int latticePath(int m, int n){
        if(m < 0 || n < 0){
            return  0;
        }
        if(m == 0 && n == 0){
            return  1;
        }
        return latticePath(m-1, n) + latticePath(m, n-1);
    }
    //Using Cache
    public  static long latticePath2(int m, int n){
       cache = new long[m+1][n+1];
       for(int i = 0; i < m+1; i++){
           for(int j = 0; j < n+1; j++){
               cache[i][j] = -1;
           }
       }
       return  helper(m,n);
    }
    private static long helper(int m, int n){
        if(cache[m][n] != -1){
            return cache[m][n];
        }
        if(m < 0 || n < 0){
            return  0;
        }
        if(m == 0 && n == 0){
            return  1;
        }
        cache[m][n] = latticePath(m-1, n) + latticePath(m, n-1);
        return cache[m][n];
    }
    public  static  long tabulationLatticePath(int m, int n){
        //Using 2D array:
        long[][] cache = new long[m+1][n+1];
        for(long[] row : cache){
            Arrays.fill(row, 1);
        }
        for(int i = 1; i < m+1; i++){
            for(int j = 1; j < n+1; j++){
                cache[i][j] = cache[i-1][j] + cache[i][j-1];
            }
        }
        //System.out.println(Arrays.deepToString(cache));
        return cache[m][n];

        //Method II: Using 1D array
//        long[] cache = new long[n+1];
//        Arrays.fill(cache, 1);
//        for(int i = 0; i < m; i++){
//            for(int j = 1; j < n+1; j++){
//                cache[j] += cache[j-1];
//            }
//        }
//        //System.out.println(Arrays.toString(cache));
//        return cache[n];
    }
    public static void main(String[] args) {
        int m, n;
        long start, end;
        double elaspedTime;
//        m = 15;
//        n = 15;
//        start = System.currentTimeMillis();
//        System.out.println(latticePath(m,n));
//        end = System.currentTimeMillis();
//        elaspedTime = (end - start) / 1000.0;
//        System.out.println("Elasped time: " + elaspedTime);
//
//        m = 15;
//        n = 15;
//        start = System.currentTimeMillis();
//        System.out.println(latticePath2(m,n));
//        end = System.currentTimeMillis();
//        elaspedTime = (end - start) / 1000.0;
//        System.out.println("Elasped time: " + elaspedTime);

        m = 10;
        n = 100;
        start = System.currentTimeMillis();
        System.out.println(tabulationLatticePath(m,n));
        end = System.currentTimeMillis();
        elaspedTime = (end - start) / 1000.0;
        System.out.println("Elasped time: " + elaspedTime);
    }
}

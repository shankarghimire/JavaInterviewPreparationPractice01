package com.shankar.dynamicprogramming;

import java.util.HashMap;

public class ReduceNumberTo1ByMemoization {
    HashMap<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        int num;
        ReduceNumberTo1ByMemoization obj = new ReduceNumberTo1ByMemoization();
        num = 100;
        long start = System.currentTimeMillis();
        System.out.println(obj.reduceToOne(num));
        double duration = (System.currentTimeMillis() - start) / 1000.0;
        System.out.println("Elasped Time: " + duration);

    }
    public int reduceToOne(int num){
        int divBy3 = Integer.MAX_VALUE;
        int  divBy2 = Integer.MAX_VALUE;
        int  sub1 = Integer.MAX_VALUE;
        if(num == 1){
            return  0;
        }
        if(map.containsKey(num)){
            return map.get(num);
        }
        if( num % 3 == 0){
            map.put(num,  1+  reduceToOne(num / 3));
        }
        if(num % 2 == 0){
            map.put(num, 1 + reduceToOne( num / 2));
        }
        map.put(num,  1 + reduceToOne(num -1 ));

        if(divBy3 < divBy2 && divBy3 < sub1){
            return  divBy3 ;
        }else if(divBy2 < sub1){
            return  divBy2  ;
        }else{
            return  sub1;
        }

    }
}

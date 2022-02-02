package com.shankar.dynamicprogramming;

/*
Reduce the number to 1 by the following operation with minimum steps
Divide the number if divisible by 3.
Divide the number if divisible by 2
subtract 1 from the number.

 */
public class ReduceNumberTo1 {
    private static long count = 0;
    public static void main(String[] args) {
        int num;
        ReduceNumberTo1 obj = new ReduceNumberTo1();
        num = 10;
        long start = System.currentTimeMillis();
        System.out.println(obj.reduceToOne(num));
        double duration = (System.currentTimeMillis() - start) / 1000.0;
        System.out.println("Elasped Time: " + duration);
        System.out.println("Count: " + count);

    }
    public  long reduceToOne(int num){
        long divBy3 = Long.MAX_VALUE;
        long  divBy2 = Long.MAX_VALUE;
        long  sub1 = Long.MAX_VALUE;
        if(num == 1){
            count++;
            return  0;
        }
        if( num % 3 == 0){
            divBy3 = 1+  reduceToOne(num / 3);
        }
        if(num % 2 == 0){
            divBy2 = 1 + reduceToOne( num / 2);
        }
        sub1 = 1 + reduceToOne(num -1 );

        if(divBy3 < divBy2 && divBy3 < sub1){
            return  divBy3 ;
        }else if(divBy2 < sub1){
            return  divBy2  ;
        }else{
            return  sub1;
        }
//        return divBy3 < divBy2 && divBy3 < sub1? divBy3: divBy2 < sub1? divBy2: sub1;
    }
}

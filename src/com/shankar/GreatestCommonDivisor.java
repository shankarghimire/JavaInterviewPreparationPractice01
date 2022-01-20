package com.shankar;

public class GreatestCommonDivisor {
    /*
    Given two integers, find the greatest common divisor (GCD).
    Input: 52, 78
    Output: 26
     */
    public static void main(String[] args) {
        int num1 = 52;
        int num2 = 78;
        int gcd = findGCD(num1, num2);
        System.out.println(num1 +", " + num2 + ": " + gcd);

    }
    public  static  int findGCD(int num1, int num2){
        int gcd = 1;
        if (num1 < 0 || num2 < 0){
            return  -1;
        }
        int bigger = num1 > num2 ? num1: num2;
        int smaller = num1 < num2 ? num1 : num2;
        int remainder =1;
        while (smaller > 0){
            remainder = bigger % smaller;
            if(remainder == 0){
                return  smaller;
            }else{
                bigger = smaller;
                smaller = remainder;
            }
        }

        return  remainder;
    }

}

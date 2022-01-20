package com.shankar;

public class SumOfNaturalNumber {
    /*
    sum of natural numbers upto nth using recursion
    input = 10
    output = 55  (i.e. 1 + 2 + 3 + 4 + 5 + ....+ 9 + 10)
     */
    public  static  int resursiveSummation(int inputNumber){
        //base case
        if( inputNumber <= 1){
            return inputNumber;
        }
        //recursive call and return value
        return inputNumber + resursiveSummation(inputNumber-1);
    }
    public static void main(String[] args) {
        System.out.println(resursiveSummation(5));
    }
}

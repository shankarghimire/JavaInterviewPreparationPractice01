package com.shankar.recursion.factorial;

public class Factorial {
    //scope variable
    private long result;
    //Wrapper method
    public long commputeFactorial(int input){
        result  = 1;
        multiplyNumber(input);
        return  result;
    }
    //Helper method
    private void multiplyNumber(int count){
        //base case
        if( count < 2){
            return;
        }
        result *= count;
        multiplyNumber(count-1);
    }

}

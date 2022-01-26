package com.shankar.recursion.naturalnumbersum;

public class NaturalNumberSum {
    //Scope variable
    private long result;
    //Wrapper method
    public  long computeSum(int num){
        result = 0;
        //call helper method
        calculate(num);
        return  result;
    }

    private void calculate(int num) {
        //base case
        if(num < 1){
            return ;
        }
        //calculate
        result += num;
        calculate(num-1);
    }

}

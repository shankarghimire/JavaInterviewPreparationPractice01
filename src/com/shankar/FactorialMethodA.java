package com.shankar;

public class FactorialMethodA {
    /*
    Calculating factorial using helper method
    1. instantiate scope variables
    2. return result
    3. a) create helper method
       b) invoke helper method
    4. base case
    5. recursive case
     */
//    1. instantiate scope variables
    private  static  int result = 1;
    //this method is the wrapper method
    public static void main(String[] args) {
        calculateFactorial(5);
        System.out.println(result);
        result = 1;
        calculateFactorial(4);
        System.out.println(result);
    }
    private  static  void calculateFactorial(int number){
        if(number < 2){
            return;
        }
        result *= number;
        calculateFactorial(number-1);
    }

}

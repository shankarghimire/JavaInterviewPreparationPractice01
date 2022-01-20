package com.shankar;

public class FactorialMethodB {
    public static void main(String[] args) {
        Factorial fact;
        fact = new Factorial();
        System.out.println(Factorial.compute(0));
        System.out.println(Factorial.compute(2));
        System.out.println(Factorial.compute(3));
        System.out.println(Factorial.compute(4));

    }
}

class Factorial{
    //instantiate scope variable
    private static int result = 1;

    //Wrapper method
    public  static  int compute(int input){
        result = 1;
        //invoke helper method
        multiplyInt(input);
        //return result
        return  result;
    }
    //Helper method
    private  static  void multiplyInt(int count){
        //Base case
        if(count < 2){
            return;
        }
        //calculate result
        result *= count;
        //Recursive case
        multiplyInt(count - 1);
    }
}

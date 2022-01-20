package com.shankar;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimalNumber = 12;
        System.out.println(findBinary(decimalNumber,""));
    }
    public  static  String findBinary(int decimal, String result){
        //Base case
        if(decimal == 0){
            return  result;
        }
        //return value
        result = decimal % 2 + result;
        //Recursive call
        return findBinary(decimal/2, result);
    }
}

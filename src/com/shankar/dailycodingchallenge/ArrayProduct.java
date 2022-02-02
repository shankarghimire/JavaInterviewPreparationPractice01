package com.shankar.dailycodingchallenge;

import java.util.Arrays;

/*
Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers
in the original array except the one at i.
For example, if our input was [1, 2, 3, 4, 5],
the expected output would be [120, 60, 40, 30, 24].
If our input was [3, 2, 1],
the expected output would be [2, 3, 6].
 */
public class ArrayProduct {
    public static int[] arrayProduct(int[] arr){
        int [] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int product = 1;
            for(int j = 0; j < arr.length; j++){
                if(i != j){
                    product *= arr[j];
                }
            }
            result[i] = product;
        }
        return  result;
    }
    public static int[] arrayProduct2(int[] arr){
        int product = 1;
        for(int i = 0; i < arr.length; i++){
            product *= arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                arr[i] = product;
            }else{
                arr[i] = product / arr[i];
            }
        }
        return  arr;
    }
    public static void main(String[] args) {
        int[] arr ;
        int[] result;
        arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        result = arrayProduct2(arr);
        System.out.println(Arrays.toString(result));
        arr = new int[]{3,2,1};
        System.out.println(Arrays.toString(arr));
        result = arrayProduct2(arr);
        System.out.println(Arrays.toString(result));

    }
}

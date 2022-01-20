package com.shankar.slidingwindow;

import java.util.Arrays;

public class MaxConsecutiveSum {
    /*
     *  Homework - Sliding/Moving Window
     *
     *  Problem 1: Max Consecutive Sum
     *
     *  Prompt:    Given an array of integers find the sum of consecutive
     *             values in the array that produces the maximum value.
     *
     *  Input:     Unsorted array of positive and negative integers
     *  Output:    Integer (max consecutive sum)
     *
     *  Example:   input = [6, -1, 3, 5, -10]
     *             output = 13 (6 + -1 + 3 + 5 = 13)
     *
     */
    public static void main(String[] args) {
        //int[] arr = {6, -1, 3, 5, -10};
        int[] arr = {-2, 2, 5, -11, 6};
        System.out.println(Arrays.toString(arr));
        int output = maxConsecutiveSum(arr);
        System.out.println(output);
    }
    public static int maxConsecutiveSum(int[] arr) {
        //YOUR WORK HERE
        int maxSum = arr[0];
        int currentsum = arr[0];
        for(int i = 1; i < arr.length; i++){
            currentsum += arr[i];
            if(arr[i] > currentsum){
                currentsum = arr[i];
            }
            if(currentsum > maxSum){
                maxSum = currentsum;
            }
        }
        return maxSum;
    }
}

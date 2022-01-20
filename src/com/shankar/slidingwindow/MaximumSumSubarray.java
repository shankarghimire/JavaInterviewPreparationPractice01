package com.shankar.slidingwindow;

import java.util.Arrays;

public class MaximumSumSubarray {
    /*
    Given an array of integers, find maximum sum subarray of the required size.
    input: {-1, 2, 3, 1,-3, 2}
    Subarray Size: 2
     */
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 1, - 3, 2};
        int size = 2;
        int maxSum = findMaximumSumSubArrayOfRequiredSize(arr,size);
        System.out.println(Arrays.toString(arr));
        System.out.println(maxSum);
    }
    public static int findMaximumSumSubArrayOfRequiredSize(int [] arr, int size){
        if(arr.length < size){
            return  -1;
        }
        int currentSum = 0;
        int maxSum  = 0;
        int i;
        for(i = 0; i < size; i++){
            currentSum += arr[i];
        }
        maxSum = currentSum;
        for( int j = i; j < arr.length; j++){
            currentSum -= arr[j-size];
            currentSum += arr[j];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        return maxSum;

    }
}

package com.shankar.slidingwindow;

import java.util.Arrays;

public class FindSubArray {
    /*
    Given an array of integers, find the subarrays that add upto a give
    number.
    ex:
    input={1, 7, 4, 3, 1, 2, 1, 5, 1}
    desired sum = 7
    output: {4,3}
     */
    public static void main(String[] args) {
    int[] arr = {1, 7, 4, 3, 1, 2, 1, 5, 1};
    int desiredSum = 7;
        System.out.println(Arrays.toString(arr));
        System.out.println(desiredSum);
        int[] result = findSubArray(arr, desiredSum);
        System.out.println(Arrays.toString(result));
    }
    public static int[] findSubArray(int[]arr, int desiredSum){
        int bestLeft = -1;
        int bestRight = -1;
        int left = 0;
        int right = 1;
        int currentSum = arr[left];
        while ( right < arr.length){
            //check the desired result
            if(currentSum == desiredSum ){
                bestLeft = left;
                bestRight = right;
                //break;
            }
            //expand subarray
            if(currentSum <= desiredSum){
                currentSum += arr[right];
                right++;
                continue;
            }
            //shrink sub array
            if(currentSum > desiredSum){
                currentSum -= arr[left];
                left++;
            }
        }
        if(bestLeft < 0 || bestRight < 0){
            return new int[]{};
        }
        return Arrays.copyOfRange(arr, bestLeft, bestRight);
    }
}

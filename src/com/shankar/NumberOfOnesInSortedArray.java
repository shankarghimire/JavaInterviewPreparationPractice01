package com.shankar;

import java.util.Arrays;

public class NumberOfOnesInSortedArray {
    /*
    Challenge 1 : Number of Ones in a Sorted Bit Array
Given a sorted bit array (values of either 0 or 1), determine the number of 1’s in the array.

Perform this in O(log(N)) time complexity.

Input: [0,0,0,1,1,1,1,1,1,1,1]

Output: 8
     */
    public static void main(String[] args) {
        int[] nums = {0,0,0};//,1,1,1,1,1,1,1,1,1};
        int count = countNumberOfOnes(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(count);
    }
    //Java Solution
    public  static int countNumberOfOnes(int[] nums){
        if(nums.length == 0){
            return  -1;
        }
        int index = -1;
        int left = 0, right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == 1){
                index = mid;
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
        if(index == -1){
            return  0;
        }
        return  nums.length - index;
    }
}

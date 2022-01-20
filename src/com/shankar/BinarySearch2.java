package com.shankar;

import java.util.Arrays;

public class BinarySearch2 {
    /*
    Given a sorted array of unique integers, and a target value determine the index of a matching value within the array. If there is not match, return -1.
    Input: [1,3,4,5,6,7,8,10,11,13,15,17,20,22], 17
    Output: 11
     */
    public static void main(String[] args) {
    int[] nums = {1,3,4,5,6,7,8,10,11,13,15,17,20,22};
    int target = 5;
        System.out.println(Arrays.toString(nums));
        System.out.println(target);
        int index = binarySearch(nums, target);
        System.out.println(index);
    }
    public static  int binarySearch(int[] nums, int target){
        if(nums.length == 0){
            return  -1;
        }
        int left = 0, right = nums.length-1;
        while (left <= right){
            int mid = (left + right ) / 2;
            if(target == nums[mid] ) {
                return mid;
            }else if(target < nums[mid]){
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
        return  -1;
    }
}

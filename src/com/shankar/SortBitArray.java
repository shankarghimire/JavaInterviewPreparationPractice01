package com.shankar;

import java.util.Arrays;

public class SortBitArray {
    public static void main(String[] args) {
        int[] nums= {0, 1, 1, 0, 1, 1, 1, 0};
        System.out.println(Arrays.toString(nums));
        int[] result = sortBitArray(nums);
        System.out.println(Arrays.toString(result));
    }
    //Method I:
    //Using two pointers and swapping the elements
    public static int[] sortBitArray2(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while (left < right){
            if(nums[left] == 0){
                left++;
            }
            if(nums[right] == 1){
                right--;
            }
            if(nums[left] == 1 && nums[right] == 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }

        }
        return  nums;
    }
    //Method II:
    //Using frequency count method: counting number of 0s and filling the array with 0s and 1s in appropriate frequency
    public static int[] sortBitArray(int[] nums){
       int countZeros = 0;
       for(int i = 0; i < nums.length; i++){
           if(nums[i] == 0){
               countZeros++;
           }
       }
       for(int i = 0; i < nums.length; i++){
           if(i < countZeros){
               nums[i] = 0;
           }else{
               nums[i] = 1;
           }
       }
        return  nums;
    }
    //Time Complexity: O(N)
    //Auxiliary Space Complexity : O(1)
}

package com.shankar.slidingwindow;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ConsecutiveSubArray {
    /*
    Given an array of positive integers and a target value, return true if there is a subarray of consecutive elements that sum up to this target value.

Input: Array of integers, target value
Output: Boolean

EXAMPLE
Input: [6,12,1,7,5,2,3], 14      	=>	Output: true (7+5+2)
Input: [8,3,7,9,10,1,13], 50		=>	Output: false

CONSTRAINTS
Time Complexity: O(N)
Auxiliary Space Complexity: O(1)

Hints:
  - the elements must be consecutive
      if I go over the target value then iterate again
      sum next consecutive value until target
     */
    public static void main(String[] args) {
//        int[] nums = {6,12,1,7,5,2,3};
//        int target = 14;
        int[] nums = {8,3,7,9,10,1,13};
        int target = 26;
        System.out.println(Arrays.toString(nums));
        System.out.println(target);
        boolean result = findConsecutiveSubarray(nums, target);
        System.out.println(result);

        //Map<Character, Integer> hSet = new HashSet<>();
    }
    /*
       l
    {6,1,1,7,5,2,3};
           r
    target =   14
     */
    public  static  boolean findConsecutiveSubarray(int[] nums, int target){
        int left = 0, right = 1;
        int sum = 0;
        sum = nums[left]  + nums[right];
        while (left < nums.length -1  && right < nums.length -1 ){
            //if sum and target are equal
            if(sum == target){
                System.out.println("left Index : " + left);
                System.out.println("right idnex : " + right);
                return  true;
            }
            //if sum < target , we need to add next element
            if(sum < target){
                right++;
                sum += nums[right];
                continue;
            }
            if(sum > target){
                sum -= nums[left];
                left++;
                //right++;
                //sum += nums[right];
            }
        }
        return  false;
    }
}

package com.shankar;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class SortedTwoSum {
    public static void main(String[] args) {
        int[] nums={5, 8, 10,12, 16, 20};
        int target = 13;
        int[] result = sortedTwoSum3(nums,target);
        System.out.println("Array : " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        System.out.println("Target elements for sum : " + Arrays.toString(result));
    }
    //Method I:
    //Using Brute Force
    public  static  int[] sortedTwoSum(int[] nums, int target){
        int[] result ={-1, -1} ;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result [0] = nums[i];
                    result[1] = nums[j];
                    return  result;
                    //break;
                }
            }
        }
        return  result;
        //Time: O(N^2)
        //Space : O(1)
    }

    //Method II
    //Using set data structure
    public  static  int[] sortedTwoSum2(int[] nums, int target){
        int[] result ={-1, -1} ;
        //creating HashSet from the array
        Set<Integer> hSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        for(int i = 0; i < nums.length; i++){
            int nextElement = target - nums[i];
            if(hSet.contains(nextElement)){
                result[0] = nums[i];
                result[1] = nextElement;
                return  result;
            }
        }
        return  result;
        //Time : O(N)
        //Space: O(N)
    }
    //Method : III
    //Using double pointers
    public  static  int[] sortedTwoSum3(int[] nums, int target){
        int[] result ={-1, -1} ;
        int left = 0;
        int right = nums.length -1;
        while(left < right){
            if(nums[left] + nums[right] == target){
                result [0] = nums[left];
                result [1] = nums[right];
                return  result;
            }
            else if(nums[left] + nums[right] > target){
                    right--;
                    continue;
            }
            else if(nums[left] + nums[right] < target){
                left++;
                continue;
            }
        }
        return  result;
        //Time : O(N)
        //Space: O(1)
    }
}

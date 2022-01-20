package com.shankar;

public class BinarySearch {
    public  static  int binarySearch(int[] nums, int left, int right, int searchValue){
        if(left > right){
            return  -1;
        }
        int mid = (left + right)/2;
        if(searchValue == nums[mid]){
            return  mid;
        }
        if( searchValue < nums[mid]){
            return binarySearch(nums, left, mid-1, searchValue);
        }else{
            return  binarySearch(nums, mid + 1, right, searchValue);
        }
    }
    public static void main(String[] args) {
        int[] nums = {5, 8, 9,10, 15, 20, 25, 30, 32, 34};
        int target = 25;
        int index = binarySearch(nums, 0, nums.length-1, target);
        if(index == -1){
            System.out.println("Not found!");
        }else{
            System.out.println(nums[index] + " is found at index : " + index );
        }

    }
}

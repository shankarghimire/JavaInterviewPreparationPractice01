package com.shankar.leetcode;

import java.util.Arrays;

/*
4. Median of Two Sorted Arrays
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).



Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106

 */
public class MedianSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        //copy all elements of nums1 and nums2 into merged array
        int i = 0,j=0;
        while (i < nums1.length && i < nums2.length){
            if(nums1[i] < nums2[i]){
                mergedArray[j] = nums1[i];
            }else{
                mergedArray[j] = nums1[i];
            }
            i++;
            j++;
        }
        //copy remaining elements from nums1 array
        while (i < nums1.length){
            mergedArray[i] = nums1[i];
            i++;
        }
        //copy remaining elements from nums1 array
        while (i < nums2.length){
            mergedArray[i] = nums2[i];
            i++;
        }
        double median = 0.0;
        if(mergedArray.length % 2 == 1){
            median =  mergedArray[mergedArray.length/2];
        }else{
            int index1 = mergedArray.length/2;
            median = (mergedArray[index1] + mergedArray[index1 + 1]) / 2.0;
        }
        return  median;
    }

    public static void main(String[] args) {
        int[] nums1, nums2;
        nums1 = new int[]{1,3};
        nums2 = new int[]{2};
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(findMedianSortedArrays(nums1, nums2));
        nums1 = new int[]{1,2};
        nums2 = new int[]{3,4};
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}

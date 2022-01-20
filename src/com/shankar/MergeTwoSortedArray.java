package com.shankar;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] numsOne = {2,4,7,9,10};
        int[] numsTwo = {1,5,6,8,12};
        System.out.println(Arrays.toString(numsOne));
        System.out.println(Arrays.toString(numsTwo));
        int[] result = mergeTwoSortedArray2(numsOne, numsTwo);
        System.out.println(Arrays.toString(result));
        System.out.println(result.length);
    }
    //Method I:
    //Using Brute Force method
    public static int[] mergeTwoSortedArray(int[] numsOne, int[] numsTwo){
        int[] result = new int[numsOne.length + numsTwo.length];
        //copying numsOne array to final array
        System.arraycopy(numsOne, 0, result,0, numsOne.length);
        System.arraycopy(numsTwo,0, result, numsOne.length, numsTwo.length);
        Arrays.sort(result);
        return result;
    }

    //Method II:
    //Using using improved version
    //Java
    /*
    Java
    Example:
        int[] numsOne = {2,4,7,9,10};
        int[] numsTwo = {1,5,6,8,12};
        int[] result = mergeTwoSortedArray2(numsOne, numsTwo);
     */
    public static int[] mergeTwoSortedArray2(int[] numsOne, int[] numsTwo){
        if(numsOne.length == 0 || numsTwo.length == 0){
            return new int[]{};
        }
        //Creates new array equals to the sum of the array1 and array2 size/length
        int[] result = new int[numsOne.length + numsTwo.length];
        int index =  0, first = 0, second  = 0;
        //copy the smaller element from both array to the main/final array
        while (first < numsOne.length && second < numsTwo.length){
            if(numsOne[first] <= numsTwo[second]){
                result [index] = numsOne[first];
                first++;
            }else{
                result[index] = numsTwo[second];
                second++;
            }
            index++;
        }
        //copy remaining elements from first array
        while (first < numsOne.length){
            result[index] = numsOne[first];
            index++;
            first++;
        }
        //copy remaining elements from second array
        while (second < numsTwo.length){
            result[index] = numsTwo[second];
            index++;
            second++;
        }
        //System.out.println(Arrays.toString(result));
        return result;
    }
}

package com.shankar.slidingwindow;

import java.util.Arrays;

public class FlipCount {
    /*
     *  Problem 2: Bit Flip
     *
     *     Given an array of binary values (0 and 1) and N number of flips (convert
     *     a 0 to a 1), determine the maximum number of consecutive 1's that can be
     *     made.
     *
     *  Input: An Array of 1's and 0's, and an Integer N denoting the number of
     *         flips
     *  Output: Integer
     *
     *  Example: bitFlip([0,1,1,1,0,1,0,1,0,0], 2)
     *  Result: 7
     */

    // Time Complexity: O(N)
    // Auxiliary Space Complexity: O(1)
    public static void main(String[] args) {
        int[] arr;
        int totalFlips;
        arr = new int[]{0,1,1,1,0,1,0,1,0,0};
        totalFlips = 2;
        System.out.println(Arrays.toString(arr));
        System.out.println(totalFlips);
        System.out.println(bitFlip3(arr, totalFlips));

        arr = new int[]{1,1,0,0,0,1,1,1,1,1};
        totalFlips = 2;
        System.out.println(Arrays.toString(arr));
        System.out.println(totalFlips);
        System.out.println(bitFlip3(arr, totalFlips));

    }

    public static int bitFlip(int[] arr, int N) {
        //YOUR WORK HERE
        int maxConsecutiveOne = 0;
        int currentConsecutiveOne = 0;
        int left = 0;
        int right = 0;
        int zeroCount  = 0;
        for(right = 0; right < arr.length; right++){
            if(arr[right] == 0){
                zeroCount++;
            }
            while (zeroCount > N){
                if(arr[left] == 0){
                    zeroCount--;
                }
                left++;
            }
            currentConsecutiveOne = right - left + 1;
            maxConsecutiveOne = Math.max(maxConsecutiveOne, currentConsecutiveOne);
        }

        return maxConsecutiveOne;
    }
    public static int bitFlip2(int[] arr, int N) {
        //YOUR WORK HERE
        int left = 0, right = 0;
        int zeroCount  = 0;
        int bestWindowWidth = -1;
        while (right < arr.length){
            //expand window
            if(zeroCount <= N){
                if(arr[right] == 0){
                    zeroCount++;
                }
                right++;
            }

            //shrink window
            if(zeroCount > N){
                if(arr[left] == 0){
                    zeroCount--;
                }
                left++;
            }
            //update best window width
            if( right - left > bestWindowWidth){
                bestWindowWidth = right - left;
            }
        }

        return bestWindowWidth;
    }
    public static int bitFlip3(int[] arr, int N) {
        //YOUR WORK HERE
        int left = 0, right = 0;
        int zeroCount  = 0;
        int bestWindowWidth = -1;
        int[] indexes = new int[N];
        while (right < arr.length){
            //expand window
            if(zeroCount <= N){
                if(arr[right] == 0){
                    indexes[zeroCount % N] = right;
                    zeroCount++;
                }
                right++;
            }

            //shrink window
            if(zeroCount > N){
                if(arr[left] == 0){
                    zeroCount--;
                    indexes[zeroCount % N] = left;
                }
                left++;
            }
            //update best window width
            if( right - left > bestWindowWidth){
                bestWindowWidth = right - left;
            }
        }
        System.out.println("index : " + Arrays.toString(indexes));
        return bestWindowWidth;
    }
}

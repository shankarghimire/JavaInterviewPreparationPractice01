package com.shankar.sorting;

import java.util.Arrays;
import java.util.logging.SocketHandler;

public class BubbleSortDemo1 {
    public static void main(String[] args) {
        BubbleSortDemo1 b1 = new BubbleSortDemo1();
        int[] arr = {5,8,4,10,3,2,1};
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted Order: ");
        System.out.println(Arrays.toString(b1.bubbleSort(arr)));
    }
    public  int[] bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return  arr;
    }
    public  int[] bubbleSort2(int[] arr){
        for(int i = arr.length -1; i >= 0; i--){
            boolean swap = false;
            for(int j = 0; j < i ; j++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swap = true;
                }
            }
            if (swap == false){
                break;
            }
        }
        return  arr;
    }
}

package com.shankar.frequencycount;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {2,8,4,5,3,2,1,6,7,3,10,1,2,3,4,5,8,9,1,1};
        System.out.println(Arrays.toString(arr));
        countFrequency(arr);
    }
    public static void countFrequency(int[] arr){
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(frequencyMap.containsKey(arr[i])){
                frequencyMap.put(arr[i], 1+ frequencyMap.get(arr[i]));
            }else{
                frequencyMap.put(arr[i],1);
            }
        }
        System.out.println(frequencyMap);
    }
    /*
    Time: O(N)
    Space: O(N)
     */
}

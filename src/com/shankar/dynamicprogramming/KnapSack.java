package com.shankar.dynamicprogramming;

public class KnapSack {
    public static void main(String[] args) {
    int [] weights = {10,20,30};
    int[] values ={60, 100, 120};
    int capacity = 50;
    Problem p1 = new Problem();
    int result = Problem.knapSack( weights, values, capacity);
        System.out.println(result);

    }
}
class Problem{
    private static int[] weightsInput;
    private static int[] valuesInput;
    public  static int knapSack(int[] weights, int[] values, int capacity){
        weightsInput = weights;
        valuesInput = values;

        return  maximizeValue(capacity, weights.length-1);
    }
    private  static  int maximizeValue(int capacity, int rockIndex){
        if(capacity == 0){
            return  0;
        }
        if(capacity < 0){
            return Integer.MIN_VALUE;
        }
        if(rockIndex < 0){
            return  0;
        }

        int leftOption = valuesInput[rockIndex] + maximizeValue(capacity - weightsInput[rockIndex], rockIndex -1);
        int rightOption = maximizeValue(capacity, rockIndex-11);
        return  Math.max(leftOption, rightOption);


    }
}

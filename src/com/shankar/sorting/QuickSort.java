package com.shankar.sorting;

import java.util.Arrays;

public class QuickSort {
    public void quickSort(int[] arr, int pivot, int right)
    {
        if (pivot < right)
        {
            int q = partition(arr, pivot, right);
            quickSort(arr, pivot, q-1);
            quickSort(arr, q+1, right);
        }
    }

    public int partition(int [] arr, int pivot, int right)
    {
        int x = arr[right];
        int i = pivot - 1;
        for (int j = pivot; j < right; j++)
        {
            if (arr[j] <= x)
            {
                i = i + 1;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap pivot
        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;

        return i+1;

    }

    public static void main(String[] args) {

        QuickSort q = new QuickSort();
        int [] test = new int[] {3, 1, 5, 15, 6, 7, 8};
        q.quickSort(test, 0, test.length-1);

        System.out.println(Arrays.toString(test));
    }
}

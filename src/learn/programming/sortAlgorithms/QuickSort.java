/*
 * Copyright (c) 2021.
 * @author Tat Tran (https://github.com/TatTran22)
 *
 */

package learn.programming.sortAlgorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] intArray = {23, 1, 55, -5, 0, 77, -99};
        System.out.println("Original Array: " + Arrays.toString(intArray));
        QuickSort(intArray, 0, intArray.length);
        System.out.println("Array after using Quick sort: " + Arrays.toString(intArray));
    }

    public static void QuickSort(int[] input, int start, int end){
        if (end - start < 2) {
            return;
        }
        int pivotIndex = partition(input, start, end);
        QuickSort(input, start, pivotIndex);
        QuickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot) ;
            if (i < j) {
                input[i] = input[j];
            }

            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot) ;
            if (i < j) {
                input[j] = input[i];
            }

        }
        input[j] = pivot;
        return j;
    }
}

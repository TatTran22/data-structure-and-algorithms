/*
 * Copyright (c) 2021-2021.
 * @author Tat Tran (https://github.com/TatTran22)
 *
 */

package learn.programming.sortAlgorithms;

import java.util.Arrays;

/**
 * In-place algorithm
 * 0(nlogn) - base 2. We're repeatedly partitioning the array into two halves
 * Unstable algorithm
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] intArray = {23, 1, 55, -5, 0, 77, -99};
        System.out.printf("Original Array:\n%s\n", Arrays.toString(intArray));
        quickSort(intArray, 0, intArray.length);
        System.out.printf("Array after using Quick Sort:\n%s\n", Arrays.toString(intArray));
    }

    /**
     * @param input array to sort
     * @param start start index
     * @param end   end index
     */
    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    /**
     * @param input array
     * @param start start index
     * @param end   end index
     * @return Pivot index
     */
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

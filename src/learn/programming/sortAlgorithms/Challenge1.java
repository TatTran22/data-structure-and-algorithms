/*
 * Copyright (c) 2021.
 * @author Tat Tran (https://github.com/TatTran22)
 *
 */

package learn.programming.sortAlgorithms;

import java.util.Arrays;

/**
 * Sort algorithms - Challenge #1
 *
 * Modify the merge sort algorithm so that it sorts integers in DESCENDING order
 * Use the usual example array
 */
public class Challenge1 {
    public static void main(String[] args) {
        int[] intArray = {23, 1, 55, -5, 0, 77, -99};
        System.out.printf("Original Array:\n%s\n", Arrays.toString(intArray));
        MergeSort.mergeSort(intArray, 0, intArray.length, false);
        System.out.printf("Array after using Bubble Sort:\n%s\n", Arrays.toString(intArray));
    }
}

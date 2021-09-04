/*
 * Copyright (c) 2021-2021.
 * @author Tat Tran (https://github.com/TatTran22)
 *
 */

package learn.programming.sortAlgorithms;

import java.util.Arrays;

/**
 * In-place algorithm
 * O(n^2) time complexity - quadratic
 * It will take 100 steps to sort 10 items, 10,000 steps to sort 100 items, 1,000,000 steps to sort 1000 items
 * Stable algorithm
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {23, 1, 55, -5, 0, 77, -99};
        System.out.printf("Original Array:\t\t\t\t\t\t%s\n", Arrays.toString(intArray));
        insertionSort(intArray);
        System.out.printf("Array after using Insertion Sort:\t%s\n", Arrays.toString(intArray));
    }

    /**
     * @param array array to sort
     */
    public static void insertionSort(int[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }
    }
}

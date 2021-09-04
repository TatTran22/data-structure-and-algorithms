/*
 * Copyright (c) 2021.
 * @author Tat Tran (https://github.com/TatTran22)
 *
 */

package learn.programming.sortAlgorithms;

import java.util.Arrays;

/**
 * In-place algorithm
 * O(n^2) time complexity - quadratic
 * It will take 100 steps to sort 10 items, 10,000 steps to sort 100 items, 1,000,000 steps to sort 1000 items
 * Doesn't require as much swapping as bubble sort
 * Unstable algorithm
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray = {23, 1, 55, -5, 0, 77, -99};
        System.out.println("Original Array: " + Arrays.toString(intArray));
        selectionSort(intArray);
        System.out.println("Array after using Selection sort: " + Arrays.toString(intArray));
    }

    /**
     * @param array array to sort
     */
    public static void selectionSort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int maxIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[maxIndex]) {
                    maxIndex = i;
                }
            }
            swap(array, maxIndex, lastUnsortedIndex);
        }
    }

    /**
     * @param array array containing the value to be swapped
     * @param i     position to be swapped
     * @param j     position to be swapped
     */
    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

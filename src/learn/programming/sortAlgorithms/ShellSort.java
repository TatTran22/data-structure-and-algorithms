/*
 * Copyright (c) 2021-2021.
 * @author Tat Tran (https://github.com/TatTran22)
 *
 */

package learn.programming.sortAlgorithms;

import java.util.Arrays;

/**
 * In-place algorithm.
 * Difficult to nail down the time complexity because it will depend on the gap. Worst case: O(n2), but it can perform much better than that.
 * Doesn't require as much shifting as insertion sort, so it usually performs better.
 * Unstable algorithm.
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] intArray = {23, 1, 55, -5, 0, 77, -99};
        System.out.printf("Original Array:\n%s\n", Arrays.toString(intArray));
        shellSort(intArray);
        System.out.printf("Array after using Shell Sort:\n%s\n", Arrays.toString(intArray));
    }

    /**
     * Variation of Insertion Sort.
     * Insertion sort chooses which element to insert using a gap of 1.
     * Shell Sort starts out using a larger gap value.
     * As the algorithms runs, the gap is reduced.
     * Goal is to reduce the amount of shifting required.
     *
     * @param array array to sort.
     */
    public static void shellSort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElement;
            }
        }
    }
}

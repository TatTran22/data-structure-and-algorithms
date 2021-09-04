/*
 * Copyright (c) 2021-2021.
 * @author Tat Tran (https://github.com/TatTran22)
 *
 */

package learn.programming.sortAlgorithms;

import java.util.Arrays;

/**
 * NOT an in-place algorithm
 * O(nlogn) - base 2. We're repeatedly dividing the array in half during the splitting phase
 * Stable algorithm
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] intArray = {23, 1, 55, -5, 0, 77, -99};
        System.out.printf("Original Array:\t\t\t\t\t%s\n", Arrays.toString(intArray));
        mergeSort(intArray, 0, intArray.length);
        System.out.printf("Array after using Merge Sort:\t%s\n", Arrays.toString(intArray));
    }

    /**
     * @param input input array
     * @param start start index
     * @param end   end index
     */
    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    /**
     * @param input input array
     * @param start start index
     * @param mid   mid index
     * @param end   end index
     */
    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}

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
        System.out.printf("Original Array:\n%s\n", Arrays.toString(intArray));
        mergeSort(intArray, 0, intArray.length, true);
        System.out.printf("Array after using Merge Sort:\n%s\n", Arrays.toString(intArray));
    }

    /**
     * @param input input array
     * @param start start index
     * @param end   end index
     * @param asc   true if ascending, false if descending
     */
    public static void mergeSort(int[] input, int start, int end, boolean asc) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(input, start, mid, asc);
        mergeSort(input, mid, end, asc);
        merge(input, start, mid, end, asc);
    }

    /**
     * @param input input array
     * @param start start index
     * @param mid   mid index
     * @param end   end index
     * @param asc   true if ascending, false if descending
     */
    public static void merge(int[] input, int start, int mid, int end, boolean asc) {
        if(asc) {
            if (input[mid - 1] <= input[mid]) {
                return;
            }
        } else {
            if (input[mid - 1] >= input[mid]) {
                return;
            }
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            if(asc){
                temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
            } else {
                temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
            }
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}

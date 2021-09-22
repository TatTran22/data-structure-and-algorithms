/*
 * Copyright (c) 2021-2021.
 * @author Tat Tran (https://github.com/TatTran22)
 *
 */

package learn.programming.sortAlgorithms;

import java.util.Arrays;

/**
 * Counting sort is often used as sort algorithm for radix sort - must be stable counting sort
 * O(n) - can achieve this because we're making assumptions about the data we'er sorting.
 * Even so, it often runs slower than O(nlogn) algorithms because of the overhead involed.
 * In-place depends on which sort algorithm you use
 * Stable algorithm
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] intArray = {4725, 4586, 1330, 8792, 1594, 5729};
        System.out.printf("Original Array:\n%s\n", Arrays.toString(intArray));
        radixSort(intArray, 10, 4);
        System.out.printf("Array after using Shell Sort:\n%s\n", Arrays.toString(intArray));
    }

    /**
     * Makes assumptions about the data.
     * Data must have same radix and width.
     * Because of this, data must be integers or strings.
     * Sort based on each individual digit or letter position.
     * Start at the rightmost position.
     * Must use a stable sort algorithm at each stage.
     *
     * @param input array to sort
     * @param radix radix of input array element
     * @param width width of input array element
     */
    public static void radixSort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];

        for (int value : input) {
            countArray[getDigit(position, value, radix)]++;
        }

        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }
        System.arraycopy(temp, 0, input, 0, numItems);
    }

    public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(10, position) % radix;
    }
}

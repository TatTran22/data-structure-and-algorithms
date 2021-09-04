package learn.programming.sortAlgorithms;

import java.util.Arrays;

public class Counting {
    public static void main(String[] args) {
        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        System.out.println("Original Array: " + Arrays.toString(intArray));
        countingSort(intArray, 1, 10);
        System.out.println("Array after using Counting sort: " + Arrays.toString(intArray));
    }

    /**
     * Makes assumptions about the data.
     * Doesn't use comparisons.
     * Counts the number of occurrences of each value.
     * Only works with non-negative discrete values,
     * Values must be within a specific range.
     *
     * @param input - array to sort.
     * @param min   - the smallest value of the input array.
     * @param max   - the largest value of the array.
     */
    public static void countingSort(int[] input, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int k : input) {
            countArray[k - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }

    }
}

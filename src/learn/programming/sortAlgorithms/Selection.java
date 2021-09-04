package learn.programming.sortAlgorithms;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] intArray = {23, 1, 55, -5, 0, 77, -99};
        System.out.println("Original Array: " + Arrays.toString(intArray));
        SelectionSort(intArray);
        System.out.println("Array after using Selection sort: " + Arrays.toString(intArray));
    }

    public static void SelectionSort(int[] array) {
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

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

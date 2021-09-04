package learn.programming.sortAlgorithms;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] intArray = {23, 1, 55, -5, 0, 77, -99};
        System.out.println("Original Array: " + Arrays.toString(intArray));
        InsertionSort(intArray);
        System.out.println("Array after using Insertion sort: " + Arrays.toString(intArray));
    }

    public static void InsertionSort(int[] array) {
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

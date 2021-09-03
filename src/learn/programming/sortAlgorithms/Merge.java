package learn.programming.sortAlgorithms;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] intArray = {23, 1, 55, -5, 0, 77, -99};
        System.out.println("Original Array: " + Arrays.toString(intArray));
        MergeSort(intArray, 0, intArray.length);
        System.out.println("Sorted Array: " + Arrays.toString(intArray));
    }

    public static void MergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        MergeSort(input, start, mid);
        MergeSort(input, mid, end);
        Merger(input, start, mid, end);
    }

    public static void Merger(int[] input, int start, int mid, int end) {
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

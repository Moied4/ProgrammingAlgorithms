package org.vanier.labs.lab14;

import java.util.Arrays;

public class InsertionSort {
    static int[] unsortedArray = {17, 8, 78, 10};

    public static void main(String[] args) {
        System.out.println("Original unsorted array: " + Arrays.toString(unsortedArray));
        insertionSort(unsortedArray);
        System.out.println("Final sorted array: " + Arrays.toString(unsortedArray));
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Shift elements greater than key to one position ahead
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            // Insert key at correct location
            array[j + 1] = key;

            // Print the array after each insertion step
            System.out.println("Step " + i + ": " + Arrays.toString(array));
        }
    }
}

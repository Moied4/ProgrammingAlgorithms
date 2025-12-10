package org.vanier.assignments.assignment4;

/**
 * Task 1: Generic Method – Swap Elements in an Array
 * Problem:
 * Write a generic static method:
 *     public static <T> void swap(T[] array, int i, int j)
 * that swaps the elements at positions i and j in the given array.
 * Demo: Swap elements in an array of String and in an array of Integer, then print the arrays.
 */

import java.util.Arrays;

public class Task1 {

    // Generic method to swap two elements in an array
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        // Integer array demo: swap 0 and 4
        Integer[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Before swap (Integer): " + Arrays.toString(numbers));
        swap(numbers, 0, 4);
        System.out.println("After swap (Integer): " + Arrays.toString(numbers));

        // String array demo: swap 1 and 4
        String[] fruits = {"kiwi", "peach", "mango", "fig", "date"};
        System.out.println("\nBefore swap (String): " + Arrays.toString(fruits));
        swap(fruits, 1, 4);
        System.out.println("After swap (String): " + Arrays.toString(fruits));
    }
}

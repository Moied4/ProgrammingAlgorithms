package org.vanier.assignments.assignment2;

// Task5.java

/**
 * Task 5: Algorithm Efficiency Analysis (Big-O Application)
 *
 * Goal:
 * Analyze and compare the Big-O time complexity of two algorithms on an array of n integers.
 *
 * Algorithm A: Find the maximum value in the array by iterating through each element once.
 * Algorithm B: Calculate the sum of all unique pairs of elements in the array.
 *
 * Questions:
 * 1. What is the Big-O time complexity of Algorithm A?
 * 2. What is the Big-O time complexity of Algorithm B?
 * 3. For a very large n, which algorithm is more efficient and why?
 *
 */

public class Task5 {

    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 6};  // Example array
        int n = arr.length;

        // Run Algorithm A: Find max value
        int max = findMax(arr, n);
        System.out.println("Maximum value found: " + max);

        // Run Algorithm B: Sum of unique pairs
        long sumPairs = sumOfUniquePairs(arr, n);
        System.out.println("Sum of all unique pairs: " + sumPairs);
    }

    /**
     * Algorithm A:
     * Finds the maximum value in the array by iterating once through all elements.
     *
     * Big-O Time Complexity: O(n)
     * Reason: Single loop that runs n times.
     */
    public static int findMax(int[] arr, int n) {
        int max = arr[0];  // Initialize max to first element

        // Loop through each element exactly once
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Update max if current element is greater
            }
        }
        return max;
    }

    /**
     * Algorithm B:
     * Calculates the sum of all unique pairs of elements in the array.
     * For pairs (i, j), only pairs where j > i are counted to avoid duplicates and self-pairing.
     *
     * Big-O Time Complexity: O(n^2)
     * Reason: Nested loops where inner loop runs roughly (n - i - 1) times for each i,
     * total roughly n(n-1)/2 iterations.
     */
    public static long sumOfUniquePairs(int[] arr, int n) {
        long sumOfUniquePairs = 0;

        // Outer loop runs n times
        for (int i = 0; i < n; i++) {
            // Inner loop runs fewer times each iteration to avoid duplicates/self-pairs
            for (int j = i + 1; j < n; j++) {
                sumOfUniquePairs += arr[i] + arr[j];
            }
        }
        return sumOfUniquePairs;
    }
}

/*
 * Answer to Question 3:
 *
 * For a very large n, Algorithm A is more efficient.
 * - Algorithm A runs in O(n) time, meaning its runtime increases linearly with input size.
 * - Algorithm B runs in O(n^2) time, meaning its runtime increases quadratically.
 *
 * As n grows large, n^2 grows much faster than n,
 * so Algorithm B will take significantly more time and resources.
 *
 * Therefore, Algorithm A is preferred for large datasets due to better scalability.
 */
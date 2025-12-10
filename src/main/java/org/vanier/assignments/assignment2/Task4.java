package org.vanier.assignments.assignment2;

// Task4.java

/**
 * Task 4: Identifying Big-O for Code Snippets (Big-O Notation)
 *
 * Goal: Determine the Big-O time complexity for simple code structures.
 *
 * For each code snippet below, state its Big-O time complexity in terms of n.
 *
 * Code snippets:
 * 1. Simple arithmetic operation and print.
 * 2. Single loop from 0 to n.
 * 3. Nested loop from 0 to n twice.
 * 4. Binary search on a sorted array.
 *
 * -----------------------------------------------
 * Explanation:
 * - Big-O notation describes how runtime scales as input size 'n' increases.
 * - We'll identify time complexity for each snippet.
 */

public class Task4 {

    public static void main(String[] args) {
        int n = 10; // Example size

        System.out.println("Snippet 1 output:");
        snippet1();
        System.out.println("\nSnippet 2 output:");
        snippet2(n);
        System.out.println("\nSnippet 3 output:");
        snippet3(n);

        // For snippet4, we need a sorted array and a target
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i * 2; // Example sorted array
        }
        int target = 10;

        System.out.println("\nSnippet 4 output:");
        snippet4(arr, target);
    }

    /**
     * Snippet 1:
     * Simple arithmetic and print operation.
     * Big-O: O(1) — constant time, as it does fixed number of operations regardless of n.
     */
    public static void snippet1() {
        int result = 5 * 10;
        System.out.println(result);
    }

    /**
     * Snippet 2:
     * Single loop from 0 to n.
     * Big-O: O(n) — linear time, as it processes each item once.
     */
    public static void snippet2(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Processing item " + i);
        }
    }

    /**
     * Snippet 3:
     * Nested loop from 0 to n twice.
     * Big-O: O(n^2) — quadratic time, as it processes n*n pairs.
     */
    public static void snippet3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Pair: " + i + ", " + j);
            }
        }
    }

    /**
     * Snippet 4:
     * Binary search on a sorted array.
     * Big-O: O(log n) — logarithmic time, as the search space halves each iteration.
     */
    public static void snippet4(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                System.out.println("Found target at index: " + mid);
                break;
            }

            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}

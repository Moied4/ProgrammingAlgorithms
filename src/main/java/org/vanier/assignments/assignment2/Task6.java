package org.vanier.assignments.assignment2;

// Task6.java

/**
 * Task 6: Optimizing a Simple Operation (Big-O Optimization)
 *
 * Goal:
 * Identify inefficient code and propose an optimized solution based on Big-O principles.
 *
 * The task is to count how many pairs of identical elements exist in an array.
 */

import java.util.HashMap;
import java.util.Map;

public class Task6 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 3, 4};

        // Using original inefficient method
        int countOriginal = countIdenticalPairsOriginal(arr);
        System.out.println("Count of identical pairs (original): " + countOriginal);

        // Using optimized method
        int countOptimized = countIdenticalPairsOptimized(arr);
        System.out.println("Count of identical pairs (optimized): " + countOptimized);
    }

    /**
     * Original method with nested loops.
     *
     * Time Complexity: O(n^2)
     * Reason: Two nested loops each iterating over array of length n.
     */
    public static int countIdenticalPairsOriginal(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        return count / 2; // Divide by 2 to avoid counting pairs twice
    }

    /**
     * Optimized method using a HashMap to count occurrences.
     *
     * Steps:
     * 1. Count frequency of each element.
     * 2. For each element with frequency k, number of pairs = k*(k-1)/2.
     *
     * Time Complexity: O(n)
     * Reason: Single pass to build frequency map + single pass to calculate pairs.
     */
    public static int countIdenticalPairsOptimized(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count frequency of each element in one pass
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        // Calculate pairs using the formula k*(k-1)/2 for each frequency k
        for (int freq : freqMap.values()) {
            if (freq > 1) {
                count += (freq * (freq - 1)) / 2;
            }
        }

        return count;
    }
}

/*
---
Task 6: Optimizing a Simple Operation (Big-O Optimization)

1. Big-O Time Complexity of the Given Method

- The original method uses two nested loops, each iterating over the array of size n.
- For each element, it compares with every other element, leading to roughly n * n = n² comparisons.
- Therefore, the time complexity is O(n²) (quadratic time).

2. Proposed More Efficient Approach

- Use a HashMap to count the frequency of each element in the array.
- Steps:
  1. Iterate once through the array and record counts of each element in the HashMap.
  2. For each element with frequency k, the number of identical pairs is k * (k - 1) / 2.
  3. Sum these counts for all elements to get the total number of identical pairs.
- This avoids checking every pair explicitly.

3. Big-O Time Complexity of the Optimized Approach

- Building the frequency map takes O(n) time (single pass).
- Calculating pairs from frequencies takes O(m) time, where m is the number of unique elements (at most n).
- Overall time complexity is O(n) (linear time).
*/

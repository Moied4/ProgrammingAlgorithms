package org.vanier.assignments.assignment5;

/**
 * Task 4: Stream - Filter and Map Unique Odd Numbers
 * Given a list of integers with duplicates, use stream operations to:
 * Filter odd numbers,
 * Remove duplicates,
 * Square each odd number,
 * Collect into a list.
 * Example:
 * Input: [2, 3, 4, 2, 6, 4, 7, 3, 5] --> Output: [9, 49, 25]
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 2, 6, 4, 7, 3, 5);

        List<Integer> processed = numbers.stream()
                .filter(n -> n % 2 != 0)    // Filter odd numbers
                .distinct()                 // Remove duplicates
                .map(n -> n * n)            // Square each number
                .collect(Collectors.toList());

        System.out.println("Processed list: " + processed);
    }
}


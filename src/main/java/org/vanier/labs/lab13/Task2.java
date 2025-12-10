package org.vanier.labs.lab13;

/**
 * Task 2 – Set Filtering
 * Create a HashSet with numbers 1–10.
 * Use an Iterator to remove all even numbers while iterating.
 * Print the modified set.
 *
 * Goal: Learn safe removal using iterator.remove().
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        // Step 1: Create a HashSet with numbers 1–10
        Set<Integer> numbers = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Step 2: Use Iterator to safely remove even numbers
        Iterator<Integer> iter = numbers.iterator();
        while (iter.hasNext()) {
            int num = iter.next();
            if (num % 2 == 0) {
                iter.remove(); // Safe removal
            }
        }

        // Step 3: Print the modified set
        System.out.println("Set after removing even numbers: " + numbers);
    }
}


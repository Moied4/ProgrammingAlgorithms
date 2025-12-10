package org.vanier.assignments.assignment5;

/**
 * Task 3: Consumer to Collect Lengths
 * Write a Consumer lambda that adds the length of each consumed string to an external List. Demonstrate by consuming a list of strings and then printing the collected lengths.
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Task3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "pear", "banana", "fig");
        List<Integer> lengths = new ArrayList<>();

        // Consumer lambda that adds string lengths to the external list
        Consumer<String> collectLength = word -> lengths.add(word.length());

        // Apply consumer to each word
        words.forEach(collectLength);

        // Output Collected lengths
        System.out.println("Collected lengths: " + lengths);
    }
}


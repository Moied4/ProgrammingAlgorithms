package org.vanier.labs.lab12;

/**
 * Task 5: Collect Into a Map Grouped by Length
 * Given a list of strings, group them by their length into a Map<Integer, List<String>>.
 *
 * List<String> words = Arrays.asList("a", "bb", "ccc", "dd", "eee");
 * Map<Integer, List<String>> grouped = ;
 *
 * System.out.println(grouped);
 */

import java.util.*;
import java.util.stream.Collectors;

public class Task5 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("a", "bb", "ccc", "dd", "eee");

        // Group words by their length into a Map where key = length, value = list of words with that length
        Map<Integer, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(grouped);
    }
}

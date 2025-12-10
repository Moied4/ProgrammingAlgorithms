package org.vanier.assignments.assignment5;

/**
 *
 * Task 2: Sort Words by Number of Vowels
 * Given a list of strings, sort them ascendingly by the count of vowels (a, e, i, o, u) in each string using a lambda Comparator.
 *
 * Example:
 *
 * Input: ["apple", "pear", "banana", "fig"]
 * Sorted by vowel count: ["fig", "pear", "apple", "banana"]
 *
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "pear", "banana", "fig");

        // Sort words by number of vowels using a lambda comparator and Stream API and print
        List<String> sorted = words.stream()
                .sorted(Comparator.comparingInt(word -> countVowels(word)))
                .collect(Collectors.toList());
        System.out.println("Sorted by vowel count: " + sorted);
    }

    // Method to count vowels in a word
    private static int countVowels(String word) {
        return (int) word.toLowerCase()
                .chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
}

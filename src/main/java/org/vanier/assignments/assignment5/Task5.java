package org.vanier.assignments.assignment5;

/**
 * Task 5: Stream Reduce to Concatenate
 * Use Stream API and a lambda to concatenate all strings from a list into a single string, separated by commas, using the reduce method.
 * Example:
 * Input: ["Java", "Python", "C++"]
 * Output: "Java,Python,C++"
 */

import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "C++");

        // Use reduce with identity "" to concatenate strings with commas
        String concatenated = languages.stream()
                .reduce("", (s1, s2) ->
                        s1.isEmpty() ? s2 : s1 + "," + s2 // If accumulator empty, add s2; else append comma + s2
                );

        System.out.println(concatenated); // Print the concatenated string
    }
}

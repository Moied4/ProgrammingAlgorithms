package org.vanier.labs.lab12;

/**
 * Task 2: Map Strings to Uppercase
 * Given a list of strings, transform all strings to uppercase using map().
 *
 * List words = Arrays.asList("apple", "banana", "cherry");
 * List upper = ;
 *
 * System.out.println(upper);
 */

import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> upperWords = words.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("These are the words in uppercase: " + upperWords);
    }
}


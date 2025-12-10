package org.vanier.labs.lab11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Task 4: Function with Lambda
 * Write a Function lambda that returns the length of a string. Use it to map a list of strings to their lengths.
 *
 * Function toLength = String::length;
 * List list = Arrays.asList("hello", "world");
 */

public class Task4 {
    public static void main(String[] args) {
        Function<String, Integer> getLength = word-> word.length();
        List<String> words = Arrays.asList("hi", "world");
        List<Integer> wordLengths = words.stream().map(getLength).collect(Collectors.toList());
       // Function<String, Integer> getLength = word-> word.length();

        System.out.println("wordLengths = " + wordLengths);
            }
}

package org.vanier.labs.lab11;

import java.util.Arrays;
import java.util.List;

/**
 * Task 2: Comparator with Lambda
 * Given a list of String. Sort it by their length using a lambda Comparator.
 *
 * List words = Arrays.asList("apple", "pear", "banana", "fig");
 */

public class Task2 {
    public static void main(String[] args) {

        //String length compare
        List <String> words = Arrays.asList("apple", "pear", "banana", "fig");
        words.sort((w1, w2) -> Integer.compare(w1.length(), w2.length()));
        System.out.println("words = " + words);

    }
}

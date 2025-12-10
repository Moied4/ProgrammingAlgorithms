package org.vanier.labs.lab12;

/**
 * Task 4: Count Elements Matching a Predicate
 * Count how many strings in a list start with the letter 'A'.
 *
 * List names = Arrays.asList("Amy", "Bob", "Anna", "Alfred");
 * long count = ;
 *
 * System.out.println("Count starting with A: " + count);
 */

import java.util.*;

public class Task4 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amy", "Bob", "Anna", "Alfred");

        long count = names.stream()                       // Create a stream from the list
                .filter(name -> name.startsWith("A")) // Keep only names starting with 'A'
                .count();                       // Count how many matched

        System.out.println("Count starting with A: " + count);
    }
}


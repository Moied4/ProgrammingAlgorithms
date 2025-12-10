package org.vanier.assignments.assignment4;

/**
 * Task 3: Remove Duplicates with HashSet
 * Problem:
 * Given a list of integers with possible duplicates,
 * write a method to return a new list with only unique elements,
 * keeping their original input order.
 * Demo: Input: [2, 5, 4, 7, 2, 3, 4] --> Output: [2, 5, 4, 7, 3].
 */

import java.util.*;

public class Task3 {

    /**
     * Generic method to remove duplicates from any list,
     * preserving the original order.
     */
    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> seen = new HashSet<>();
        List<T> uniqueList = new ArrayList<>();

        for (T element : list) {
            if (seen.add(element)) { // returns false if already present
                uniqueList.add(element);
            }
        }
        return uniqueList;
    }

    public static void main(String[] args) {
        List<Integer> inputInts = Arrays.asList(2, 5, 4, 7, 2, 3, 4);
        System.out.println("Input Integers: " + inputInts);
        System.out.println("Unique Integers: " + removeDuplicates(inputInts));

        // Generic method supports other types: for example String
        // List<String> inputStrings = Arrays.asList("apple", "orange", "apple", "banana");
        // System.out.println("Unique Strings: " + removeDuplicates(inputStrings));
    }
}

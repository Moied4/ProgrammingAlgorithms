package org.vanier.assignments.assignment4;

/**
 * Task 4: Min/Max in a Generic List
 * Problem:
 * Implement a generic static method:
 *
 * public static <T extends Comparable<T>> T min(List<T> list)
 * that returns the smallest element.
 * Demo: Find the minimum of a List<Double> and a List<String>.
 */

import java.util.*;

public class Task4 {

    // Generic method to find the minimum element in a list including exception handling
    public static <T extends Comparable<T>> T min(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List must not be null or empty");
        }

        T minElement = list.get(0); // Start with the first element as min
        for (T item : list) {
            if (item.compareTo(minElement) < 0) { // Compare to find smaller element
                minElement = item;
            }
        }
        return minElement;
    }
    //Demo finding minimum in List<Double> and in List<String>
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(5.1, 0.1, 7.8, 3.5, 1.2);
        System.out.println("Minimum double: " + min(doubles));

        List<String> strings = Arrays.asList("apple", "blueberry", "strawberry", "banana");
        System.out.println("Minimum string: " + min(strings));
    }
}

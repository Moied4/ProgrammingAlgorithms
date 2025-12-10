package org.vanier.assignments.assignment4;

/**
 * Task 5: Count Frequency of Elements in a List
 * Problem:
 * Write a generic method that returns a map containing the frequency of each element in the list.
 * Demo: Show usage with List<String> and List<Integer>.
 */

import java.util.*;

public class Task5 {

    /**
     * Returns a map of element frequencies in the list.
     * Works with any type using generics.
     */
    public static <T> Map<T, Integer> countFrequencies(List<T> list) {
        Map<T, Integer> freqMap = new HashMap<>();

        for (T element : list) {
            freqMap.put(element, freqMap.getOrDefault(element, 0) + 1);
        }

        return freqMap;
    }

    public static void main(String[] args) {
        // Demo List<Integer>
        List<Integer> intList = Arrays.asList(3, 2, 3, 2, 5, 7, 7, 3);
        System.out.println("Integer Frequencies: " + countFrequencies(intList));

        // Demo List<String>
        List<String> fruitList = Arrays.asList("kiwi", "kiwi", "orange", "blueberry", "blueberry", "kiwi", "kiwi");
        System.out.println("String Frequencies: " + countFrequencies(fruitList));
    }
}

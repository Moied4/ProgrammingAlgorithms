package org.vanier.assignments.assignment4;

/**
 * Task 2: Find the Most Frequent Element in a List
 * Problem:
 * Given a List, write a generic static method that returns the element that appears most frequently (mode). If there are ties, return any one of them.
 * Demo: Show usage with List<String> and List<Integer>. Use Java collections only.
 */

import java.util.*;

public class Task2 {

    // Returns the most frequent element (mode) from the list; ties return any one of them
    public static <T> T findMostFrequent(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List must not be null or empty");
        }

        Map<T, Integer> freqMap = new HashMap<>();
        for (T item : list) {
            freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
        }

        T mostFrequent = null;
        int maxCount = 0;

        // Find the element with the highest frequency
        for (Map.Entry<T, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostFrequent;
    }
    //Demo
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "banana", "peach", "apple", "orange", "peach", "banana", "apple");
        System.out.println("Most frequent fruit: " + findMostFrequent(fruits));

        List<Integer> numbers = Arrays.asList(7, 3, 9, 2, 3, 7, 7, 5, 3, 9);
        System.out.println("Most frequent number: " + findMostFrequent(numbers));
    }
}

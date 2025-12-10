package org.vanier.assignments.assignment1;

/**
 * Question 10: Practical Application & Time Measurement (10 Marks)
 * a. (5 Marks) Write Java code that demonstrates the time difference for adding 50,000 elements to the beginning of both an ArrayList and a LinkedList. Print the time taken for each operation in milliseconds.
 * Initialize both collections.
 * Use System.nanoTime() to measure the start and end times for each addition loop.
 * Convert the time difference to milliseconds for printing.
 * b. (5 Marks) Based on your results from part (a), explain why LinkedList is significantly faster for this specific operation compared to ArrayList.
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class Task10 {
    public static void main(String[] args) {
        // a) Time difference for adding 50,000 elements at the beginning of ArrayList and LinkedList

        final int ELEMENTS = 50000;

        // Initialize ArrayList and LinkedList
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Measure time for adding at the beginning of ArrayList
        long startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS; i++) {
            arrayList.add(0, i);  // Inserting at index 0 shifts elements
        }
        long endTime = System.nanoTime();
        long arrayListDuration = (endTime - startTime) / 1_000_000;  // Convert to milliseconds

        // Measure time for adding at the beginning of LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS; i++) {
            linkedList.addFirst(i);  // Efficiently adds at the front
        }
        endTime = System.nanoTime();
        long linkedListDuration = (endTime - startTime) / 1_000_000;  // Convert to milliseconds

        // Print the results
        System.out.println("Time taken to add " + ELEMENTS + " elements at the beginning:");
        System.out.println("ArrayList: " + arrayListDuration + " ms");
        System.out.println("LinkedList: " + linkedListDuration + " ms\n");

        // b) Explanation of the results
        System.out.println("Explanation:");
        System.out.println("LinkedList is significantly faster for adding elements at the beginning because it");
        System.out.println("stores elements as nodes linked together. Adding at the front just involves");
        System.out.println("changing a few pointers, which takes constant time O(1).");
        System.out.println("On the other hand, ArrayList uses a dynamic array. Adding at index 0 requires");
        System.out.println("shifting all existing elements to the right to make space, resulting in");
        System.out.println("a time complexity of O(n) per insertion, which is much slower.");
    }
}

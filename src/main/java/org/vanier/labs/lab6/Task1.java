package org.vanier.labs.lab6;

/**
 * Task 1: MyArrayList - Core Operations (Easy)
 * * Goal: Implement the fundamental components of an array-backed list.
 * * Create a generic class MyArrayList<T>:
 * * Declare the essential internal state: Object[] elements; and int size;.
 * * Implement a constructor that initializes elements with a default capacity (e.g., 10) and size to 0.
 * * Implement add(T element):
 * * This method should add an element to the end of the list.
 * * Ensure it handles the resize() logic: if the internal array is full, create a new array (e.g., double the size), copy existing elements, and update the elements reference.
 * * Implement int size():
 * * Return the current number of elements in the list.
 * * Demonstrate: In your LabTest class, create a MyArrayList<String>. Add at least 15-20 strings (to trigger resize), then print the size and some elements to show they were added.
 */

public class Task1 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        // Add 20 strings to trigger resize
        for (int i = 1; i <= 20; i++) {
            list.add("Item " + i);
        }

        // Print size
        System.out.println("Size: " + list.size());

        // Print some elements to show they were added
        System.out.println("First item: " + list.get(0));
        System.out.println("Last item: " + list.get(list.size() - 1));
        System.out.println("Middle item: " + list.get(10));
    }
}

/**Big-O Analysis
 *
 *add(T element): O(1) amortized, O(n) worst-case when resizing.
*
 resize(): O(n) because it copies all elements.
*
 size(): O(1)
*
 get(int index): O(1)
 */
package org.vanier.labs.lab10;

// Task 2: HashSet
// Create a HashSet and add "apple", "banana", "apple", "orange".
// Print the set. How many elements are in it and why?

import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        HashSet<String> fruits = new HashSet<>();

        // Add elements to the set
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");   // Duplicate entry
        fruits.add("orange");

        // Print the contents of the set
        System.out.println("HashSet contents: " + fruits);

        // Print the size of the set
        System.out.println("Number of elements: " + fruits.size());

        // Explanation:
        // HashSet does not allow duplicate values.
        // "apple" is added only once even though we tried to add it twice.
        // So the total number of elements is 3: "apple", "banana", and "orange".
    }
}


package org.vanier.assignments.assignment1;

/**
 * Question 3: ArrayList Basics & Operations (10 Marks)
 * Consider an ArrayList named cities.
 * a. (3 Marks) Write Java code to create this ArrayList and add "London", "Paris", "Tokyo", "New York" to it.
 * b. (4 Marks) Add "Rome" at the beginning of the cities list and "Berlin" at index 3. Then remove "Tokyo" from the list. Print the cities list after these operations.
 * c. (3 Marks) What is the primary advantage of using ArrayList over a primitive array when you don't know the exact number of elements beforehand?
 */

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        // a) Creating the ArrayList and adding cities
        ArrayList<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("New York");

        // b) Performing operations on the list
        cities.add(0, "Rome");         // Add "Rome" at the beginning
        cities.add(3, "Berlin");       // Add "Berlin" at index 3
        cities.remove("Tokyo");        // Remove "Tokyo"

        // Print the cities list after the operations
        System.out.println("Cities list after operations: " + cities);

        // c) Explanation
        System.out.println("\nAnswer to part (c):");
        System.out.println("The primary advantage of using an ArrayList over a primitive array is that it can dynamically resize.");
        System.out.println("This means you don't need to know the exact number of elements in advance, and you can add or remove elements easily.");
    }
}

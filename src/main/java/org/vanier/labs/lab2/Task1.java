package org.vanier.labs.lab2;

    /**1.ArrayList Creation and Population:
    *Create an ArrayList of String objects named fruits.
    *Add at least five different fruit names to the fruits ArrayList (e.g., "Apple", "Banana", "Cherry", "Date", "Elderberry").
    *Create an ArrayList of Integer objects named studentAges.
    *Add at least five different ages to the studentAges ArrayList (e.g., 18, 19, 20, 21, 22).
     */

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        // Create an ArrayList of String objects named fruits
        ArrayList<String> fruits = new ArrayList<>();

        // Add at least 5 different fruit names to the fruits ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Raspberry");

        // Create an ArrayList of Integer objects named studentAges
        ArrayList<Integer> studentAges = new ArrayList<>();

        // Add at least 5 different ages to the studentAges ArrayList
        studentAges.add(18);
        studentAges.add(19);
        studentAges.add(20);
        studentAges.add(21);
        studentAges.add(22);

        // Print the lists to the console
        System.out.println("Fruits: " + fruits);
        System.out.println("Student Ages: " + studentAges);
    }
}

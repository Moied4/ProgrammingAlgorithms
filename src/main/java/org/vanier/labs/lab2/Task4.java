package org.vanier.labs.lab2;

/**Print the current size of both fruits and studentAges.
 *Check if the fruits ArrayList is empty and print the result.
 */

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        // Initialize fruits ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Raspberry");

        // Initialize studentAges ArrayList
        ArrayList<Integer> studentAges = new ArrayList<>();
        studentAges.add(18);
        studentAges.add(19);
        studentAges.add(20);
        studentAges.add(21);
        studentAges.add(22);

        // --- Task 4 ---

        // 1. Print the current size of both fruits and studentAges
        System.out.println("Size of fruits list: " + fruits.size());
        System.out.println("Size of studentAges list: " + studentAges.size());

        // 2. Check if the fruits ArrayList is empty and print the result
        System.out.println("Is the fruits list empty? " + fruits.isEmpty());
    }
}


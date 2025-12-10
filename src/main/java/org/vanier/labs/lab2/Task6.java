package org.vanier.labs.lab2;

/**6. Advanced ArrayList Operations:
 *Create another ArrayList called tropicalFruits and add "Pineapple", "Papaya", "Coconut". Use addAll() to add all elements from tropicalFruits to the fruits ArrayList. Print fruits.
 *Use the indexOf() method to find the index of "Banana" in the fruits ArrayList. Print the index.
 *Use the clear() method to remove all elements from studentAges. Print studentAges and its size to confirm it's empty.
 */

import java.util.ArrayList;

public class Task6 {
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

        // --- Task 6: Advanced ArrayList Operations ---

        // 1. Create tropicalFruits and add items
        ArrayList<String> tropicalFruits = new ArrayList<>();
        tropicalFruits.add("Pineapple");
        tropicalFruits.add("Papaya");
        tropicalFruits.add("Coconut");

        // Use addAll() to add tropicalFruits to fruits
        fruits.addAll(tropicalFruits);

        // Print the updated fruits list
        System.out.println("Updated fruits list after addAll:");
        System.out.println(fruits);

        // 2. Use indexOf() to find the index of "Banana"
        int bananaIndex = fruits.indexOf("Banana");
        System.out.println("\nIndex of 'Banana' in fruits list: " + bananaIndex);

        // 3. Use clear() to remove all elements from studentAges
        studentAges.clear();

        // Print studentAges and its size to confirm it's empty
        System.out.println("\nstudentAges after clear(): " + studentAges);
        System.out.println("Size of studentAges: " + studentAges.size());
    }
}


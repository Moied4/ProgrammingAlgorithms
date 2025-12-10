package org.vanier.labs.lab2;

/**2.Accessing and Modifying Elements:
 *Print the element at index 2 in the fruits ArrayList.
 *Change the fruit at index 0 to "Mango" and print the updated fruits ArrayList.
 *Retrieve and print the age of the student at index 3 from studentAges.
 */

import java.util.ArrayList;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        // Minimal setup just for demonstration
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Raspberry");

        ArrayList<Integer> studentAges = new ArrayList<>();
        studentAges.add(18);
        studentAges.add(19);
        studentAges.add(20);
        studentAges.add(21);
        studentAges.add(22);

        // --- Task 2: Accessing and Modifying Elements ---

        // Print the element at index 2 in the fruits ArrayList
        System.out.println("Fruit at index 2: " + fruits.get(2));  // Cherry

        // Change the fruit at index 0 to "Mango"
        fruits.set(0, "Mango");

        // Print the updated fruits ArrayList
        System.out.println("Updated fruits list: " + fruits);

        // Retrieve and print the age of the student at index 3
        System.out.println("Student age at index 3: " + studentAges.get(3));  // 21
    }
}

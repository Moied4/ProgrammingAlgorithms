package org.vanier.labs.lab2;

/**5.Iterating Through ArrayLists:
 *Use a standard for loop to print all elements of the fruits ArrayList.
*Use an enhanced for loop to print all elements of the studentAges ArrayList.
*Iterate through largeList and find the sum of all elements. Measure and print the time it takes for this operation.
 */

import java.util.ArrayList;
import java.util.Random;

public class Task5 {
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

        // Initialize and populate largeList with 100,000 random integers (0–1000)
        ArrayList<Integer> largeList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 100_000; i++) {
            largeList.add(rand.nextInt(1001));  // 0 to 1000
        }

        // --- Task 5: Iterating Through ArrayLists ---

        // 1. Use a standard for loop to print all elements of fruits
        System.out.println("Fruits list using standard for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Index " + i + ": " + fruits.get(i));
        }

        // 2. Use an enhanced for loop to print all elements of studentAges
        System.out.println("\nStudent ages using enhanced for loop:");
        for (int age : studentAges) {
            System.out.println(age);
        }

        // 3. Iterate through largeList and find the sum of all elements, measuring time
        long startTime = System.nanoTime();

        long sum = 0;
        for (int num : largeList) {
            sum += num;
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("\nSum of all elements in largeList: " + sum);
        System.out.println("Time taken to compute sum: " + duration + " nanoseconds");
    }
}

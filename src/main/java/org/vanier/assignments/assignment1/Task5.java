package org.vanier.assignments.assignment1;

/**
 * Question 5: LinkedList Fundamentals (10 Marks)
 * a. (4 Marks) Create a LinkedList of Double objects named prices. Add the values 9.99, 12.50, 5.00, and 20.75 to it. Then, add 7.25 to the front and remove the last element. Print the prices list.
 * b. (3 Marks) Describe a scenario where LinkedList would be a more suitable choice than ArrayList for adding/removing elements.
 * c. (3 Marks) What is the main difference in how LinkedList stores its elements compared to ArrayList?
 */

import java.util.LinkedList;

public class Task5 {
    public static void main(String[] args) {

        // a) Create LinkedList<Double> prices and perform operations
        LinkedList<Double> prices = new LinkedList<>();
        prices.add(9.99);
        prices.add(12.50);
        prices.add(5.00);
        prices.add(20.75);

        prices.addFirst(7.25);       // Add 7.25 to the front
        prices.removeLast();          // Remove the last element

        System.out.println("Prices list after operations: " + prices);

        // b) Scenario where LinkedList is better than ArrayList
        System.out.println("\nAnswer to 5b:");
        System.out.println("LinkedList is more suitable when there are frequent insertions and removals at the beginning or middle of the list.");
        System.out.println("For example, implementing a queue or a deque where elements are added and removed from both ends.");

        // c) Main difference in storage between LinkedList and ArrayList
        System.out.println("\nAnswer to 5c:");
        System.out.println("ArrayList stores elements in a continuous dynamic array, allowing fast random access.");
        System.out.println("LinkedList stores elements as nodes linked via pointers, which allows efficient insertions/removals but slower random access.");
    }
}

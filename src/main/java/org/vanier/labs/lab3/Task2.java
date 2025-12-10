package org.vanier.labs.lab3;

/**
 *1. 2. Adding and Removing at Ends (Efficient Operations):
 *   Add "Yogurt" to the beginning of the shoppingList using addFirst().
 *   Add "Orange Juice" to the end of the shoppingList using addLast().
 *   Remove the first item from the shoppingList using removeFirst().
 *   Remove the last item from the shoppingList using removeLast().
 *   Add 22.0 to the beginning of temperatures.
 *   Remove the last temperature from temperatures.
 *   New Task: Add 100,000 random Double values (between 0.0 and 100.0) to a new LinkedList<Double> named largeLinkedList. Measure and print the time it takes for this operation. (Hint: Use System.nanoTime() and addLast()).
*/

import java.util.LinkedList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        // 1. LinkedList Creation and Population
        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("Eggs");
        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Cheese");
        shoppingList.add("Apples");

        LinkedList<Double> temperatures = new LinkedList<>();
        temperatures.add(25.5);
        temperatures.add(30.1);
        temperatures.add(18.0);
        temperatures.add(27.3);
        temperatures.add(32.5);

        // 2. Adding and Removing at Ends (Efficient Operations)
        shoppingList.addFirst("Yogurt");                // Add to beginning
        shoppingList.addLast("Orange Juice");           // Add to end
        shoppingList.removeFirst();                     // Remove from beginning
        shoppingList.removeLast();                      // Remove from end

        temperatures.addFirst(22.0);                     // Add temperature to beginning
        temperatures.removeLast();                      // Remove last temperature

        // Print lists to confirm updates
        System.out.println("Updated Shopping List: " + shoppingList);
        System.out.println("Updated Temperatures: " + temperatures);

        // New Task: Add 100,000 random Double values to a LinkedList and measure time
        LinkedList<Double> largeLinkedList = new LinkedList<>();
        Random random = new Random();

        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            double value = 0.0 + (100.0 - 0.0) * random.nextDouble(); // Between 0.0 and 100.0
            largeLinkedList.addLast(value);
        }

        long endTime = System.nanoTime();
        double elapsedMillis = (endTime - startTime) / 1_000_000.0;

        System.out.printf("Time to add 100,000 random Doubles: %.3f milliseconds%n", elapsedMillis);
    }
}


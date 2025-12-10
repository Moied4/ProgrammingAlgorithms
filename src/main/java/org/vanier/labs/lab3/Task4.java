package org.vanier.labs.lab3;

/**4. Checking Size and Iterating:
 *Print the current size of both shoppingList and temperatures.
 *Use an enhanced for loop to print all elements of the shoppingList.
 *Use a standard for loop to print all elements of the temperatures LinkedList.
 */

import java.util.LinkedList;

public class Task4 {
    public static void main(String[] args) {
        // Setup example lists (you can replace or merge with previous code)
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

        // 4. Checking Size and Iterating

        // Print sizes
        System.out.println("Size of shoppingList: " + shoppingList.size());
        System.out.println("Size of temperatures: " + temperatures.size());

        // Enhanced for loop to print all elements of shoppingList
        System.out.println("Shopping List Items:");
        for (String item : shoppingList) {
            System.out.println("- " + item);
        }

        // Standard for loop to print all elements of temperatures
        System.out.println("Temperature Readings:");
        for (int i = 0; i < temperatures.size(); i++) {
            System.out.println("- " + temperatures.get(i));
        }
    }
}


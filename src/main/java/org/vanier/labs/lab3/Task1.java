package org.vanier.labs.lab3;

/**
 *1. LinkedList Creation and Population:
 *Create a LinkedList of String objects named shoppingList.
 *Add at least five different items to the shoppingList (e.g., "Eggs", "Milk", "Bread", "Cheese", "Apples").
 *Create a LinkedList of Double objects named temperatures.
 *Add at least five different temperature readings (e.g., 25.5, 30.1, 18.0, 27.3, 32.5) to the temperatures LinkedList.
*/

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {

        // 1. LinkedList Creation and Population:

        // Shopping list with String items
        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("Eggs");
        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Cheese");
        shoppingList.add("Apples");

        // Temperature readings with Double values
        LinkedList<Double> temperatures = new LinkedList<>();
        temperatures.add(25.5);
        temperatures.add(30.1);
        temperatures.add(18.0);
        temperatures.add(27.3);
        temperatures.add(32.5);

        // Print both lists to confirm
        System.out.println("Shopping List: " + shoppingList);
        System.out.println("Temperature Readings: " + temperatures);
    }
}


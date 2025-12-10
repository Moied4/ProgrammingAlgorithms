package org.vanier.labs.lab13;

/**
 * Task 5 – Custom List Traversal
 * Create a LinkedList of colors.
 * Write a method iterateEverySecondElement(List list)
 * that uses an Iterator to print every second element only.
 *
 * Goal: Implement custom traversal logic with Iterator.
 */


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Yellow");

        System.out.println("Every second color:");
        iterateEverySecondElement(colors);
    }

    public static void iterateEverySecondElement(List<?> list) {
        Iterator<?> iterator = list.iterator();
        boolean print = false;

        while (iterator.hasNext()) {
            Object element = iterator.next();

            if (print) {
                System.out.println(element);
            }

            // Toggle print every iteration: false → true → false...
            print = !print;
        }
    }
}


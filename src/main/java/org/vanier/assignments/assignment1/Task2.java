package org.vanier.assignments.assignment1;
import java.util.ArrayList;

/**
 *Question 2: Array Homogeneity & Flexibility (10 Marks)
 *a. (5 Marks) Can a Java array store both String and Integer objects in the same array (e.g., ["Hello", 123])? Explain your answer with respect to Java's type system for arrays.
 *b. (5 Marks) If you need to store a collection of elements where the size frequently changes (e.g., adding or removing elements often), would a traditional Java array be the most suitable choice? Why or why not?
 */

public class Task2 {

    public static void main(String[] args) {

        // a) Can a Java array store both String and Integer objects in the same array?
        System.out.println("Answer to Question 2a:");
        System.out.println("No, a regular Java array cannot store both String and Integer if declared with a specific type.");
        System.out.println("However, using Object[] allows mixed types:");

        Object[] mixedArray = {"Hello", 123};
        for (Object item : mixedArray) {
            System.out.println(" - " + item + " (type: " + item.getClass().getSimpleName() + ")");
        }

        // Explanation of risks
        System.out.println("Note: Using Object[] sacrifices type safety and may lead to runtime errors.\n");

        // b) Is a traditional Java array suitable when the collection size changes frequently?
        System.out.println("Answer to Question 2b:");
        System.out.println("No, traditional arrays have fixed size and are not suitable for frequently changing data.");
        System.out.println("ArrayList is a better option:");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.remove(0);  // Removes first element

        System.out.println("Current contents of ArrayList: " + numbers);
        System.out.println("ArrayList resizes dynamically and provides built-in methods like add(), remove(), and size().");
    }
}

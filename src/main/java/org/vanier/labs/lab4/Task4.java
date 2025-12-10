package org.vanier.labs.lab4;

/**
 * Task 4: Simple Math Utility (Polymorphism - Overloading)
 * Goal: Implement method overloading within a single utility class to perform similar operations on different data types.
 * Create a MathUtils class:
 *
 * All methods in this class should be static (no need to create MathUtils objects).
 *
 * Implement overloaded add methods:
 *
 * static int add(int a, int b): Returns the sum of two integers.
 *
 * static double add(double a, double b): Returns the sum of two doubles.
 *
 * Implement overloaded findMax methods:
 *
 * static int findMax(int[] numbers): Returns the maximum integer from an array.
 *
 * static double findMax(double[] numbers): Returns the maximum double from an array.
 *
 * Demonstrate Compile-time Polymorphism:
 *
 * In your main method, call each of the overloaded add and findMax methods with different argument types (e.g., MathUtils.add(5, 10); and MathUtils.add(5.5, 10.2);).
 *
 * Create example integer and double arrays and call the findMax methods.
 *
 * Print the results of each call.
 *
 * Explain: How does the Java compiler determine which specific add or findMax method to call when you invoke them?
 *
 *
 */

public class Task4 {
    public static void main(String[] args) {
        // Using overloaded add methods
        int sumInt = MathUtils.add(5, 10);
        double sumDouble = MathUtils.add(5.5, 10.2);

        System.out.println("Sum of integers: " + sumInt);          // 15
        System.out.println("Sum of doubles: " + sumDouble);        // 15.7

        // Arrays to test findMax
        int[] intArray = {3, 8, 2, 9, 4};
        double[] doubleArray = {2.5, 3.7, 1.8, 4.9, 3.3};

        // Using overloaded findMax methods
        int maxInt = MathUtils.findMax(intArray);
        double maxDouble = MathUtils.findMax(doubleArray);

        System.out.println("Max integer: " + maxInt);              // 9
        System.out.println("Max double: " + maxDouble);            // 4.9
    }
}


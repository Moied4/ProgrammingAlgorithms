package org.vanier.labs.lab5;

/**Task 1: Identifying Basic Big-O **
 *Description: For each of the following scenarios, identify the most appropriate Big-O notation that describes its time complexity.
 *Scenarios:
 *Looking up a specific word in a dictionary where you directly jump to the page based on the first letter.
 *Printing every single element in a list of n items.
 *Calculating the result of 2 + 3.
 *Finding a number in a sorted list by repeatedly dividing the search space in half.
 *Expected Answer Format: Provide the Big-O notation for each scenario (e.g., "1. O(n)").
 */

    public class Task1 {
        public static void main(String[] args) {
            System.out.println("**Task 1: Identifying Basic Big-O**");
            System.out.println();

            System.out.println("1. Looking up a specific word in a dictionary where you directly jump to the page based on the first letter:");
            System.out.println("   ➤ Big-O: O(1)");

            System.out.println("2. Printing every single element in a list of n items:");
            System.out.println("   ➤ Big-O: O(n)");

            System.out.println("3. Calculating the result of 2 + 3:");
            System.out.println("   ➤ Big-O: O(1)");

            System.out.println("4. Finding a number in a sorted list by repeatedly dividing the search space in half:");
            System.out.println("   ➤ Big-O: O(log n)");
        }
    }



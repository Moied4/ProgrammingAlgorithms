package org.vanier.labs.lab5;

/**
 * Task 4: Comparing ArrayList vs. LinkedList Operations
 *
 * Description:
 * Using the provided "Summary: ArrayList vs. LinkedList Performance" table,
 * identify which data structure is generally more efficient for each operation
 * in terms of Big-O time complexity.
 *
 * Operations:
 * 1. Accessing an element at a specific index (e.g., get(5))
 * 2. Adding an element to the beginning of the list
 * 3. Adding an element to the end of the list
 *
 * Expected Answer Format: "1. [Data Structure Name]"
 */

public class Task4 {
    public static void main(String[] args) {
        System.out.println("**Task 4: Comparing ArrayList vs. LinkedList Operations**");
        System.out.println();

        System.out.println("1. ArrayList (Reasoning: O(1) random access vs. O(n) traversal in LinkedList)");
        System.out.println("2. LinkedList (Reasoning: O(1) for adding at head vs. O(n) shift in ArrayList)");
        System.out.println("3. ArrayList (Reasoning: Amortized O(1) for adding at end, while LinkedList is also O(1), but with more overhead)");
    }
}


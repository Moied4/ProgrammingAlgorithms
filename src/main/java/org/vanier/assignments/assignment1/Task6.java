package org.vanier.assignments.assignment1;

/**
 *Question 6: LinkedList Efficiency (10 Marks)
 * Consider a LinkedList containing 1 million elements.
 * a. (5 Marks) If you need to add a new element to the very end of this LinkedList, would this operation be fast or slow? Explain why, referencing LinkedList's internal structure.
 * b. (5 Marks) If you need to retrieve an element at a specific index (e.g., get(750000)), would this operation be fast or slow? Explain the process LinkedList must undertake to perform this operation.
 */


public class Task6 {
    public static void main(String[] args) {
        System.out.println("Question 6a:");
        System.out.println("Adding a new element to the very end of a LinkedList is FAST.");
        System.out.println("This is because LinkedList maintains a reference to the tail node,");
        System.out.println("allowing direct insertion at the end in constant time (O(1)) without traversing the list.\n");

        System.out.println("Question 6b:");
        System.out.println("Retrieving an element at a specific index (e.g., get(750000)) is SLOW.");
        System.out.println("LinkedList must start from the head and traverse nodes one-by-one until it reaches the desired index.");
        System.out.println("This traversal requires linear time (O(n)), making it inefficient for large lists.");
    }
}


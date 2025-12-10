package org.vanier.assignments.assignment1;

/**
 * Question 4: ArrayList Performance (10 Marks)
 * Imagine you have an ArrayList containing 1 million elements.
 * a. (5 Marks) If you need to access an element at a specific index (e.g., get(500000)), would this operation be fast or slow? Explain why, referring to the internal structure of ArrayList.
 * b. (5 Marks) If you frequently need to insert elements at the very beginning of this 1 million-element ArrayList, would this be an efficient operation? Explain the underlying process that makes it efficient or inefficient.
 */

public class Task4 {
    public static void main(String[] args) {
        //Part a)
        System.out.println("Question 4a:");
        System.out.println("Accessing an element at a specific index (e.g., get(500000)) is FAST.");
        System.out.println("Why? Because ArrayList uses an internal array that allows direct indexing in constant time (O(1)).");
        System.out.println("So, accessing get(500000) is quick, even with 1 million elements.\n");
        //Part b)
        System.out.println("Question 4b:");
        System.out.println("Inserting an element at the beginning of a large ArrayList is SLOW.");
        System.out.println("Why? Because all existing elements must be shifted one position to the right.");
        System.out.println("This shifting takes linear time (O(n)), so doing it frequently can severely affect performance.");
        System.out.println("If you often insert at the front, consider using a LinkedList instead.");
    }
}

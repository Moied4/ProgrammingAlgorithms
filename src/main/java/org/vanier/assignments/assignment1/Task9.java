package org.vanier.assignments.assignment1;

/**
 * Question 9: Comparing Internal Mechanisms (10 Marks)
 * a. (5 Marks) Explain the concept of "resizing" in an ArrayList. When does it happen, and what is the performance implication of this process?
 * b. (5 Marks) How does a LinkedList avoid the need for resizing like an ArrayList? Describe how elements are "linked" together.
 */

public class Task9 {
    public static void main(String[] args) {

        // a) Explain the concept of "resizing" in an ArrayList.
        System.out.println("Question 9a:");
        System.out.println("Resizing in an ArrayList happens when the internal array is full and a new element needs to be added.");
        System.out.println("At this point, ArrayList creates a new, larger array (usually about 1.5 to 2 times the original size),");
        System.out.println("copies all existing elements to the new array, and then adds the new element.");
        System.out.println("This resizing operation is costly (O(n) time) because of the copying process.");
        System.out.println("However, resizing happens infrequently, so most add operations are still efficient (amortized O(1)).");
        System.out.println();

        // b) How does a LinkedList avoid the need for resizing like an ArrayList?
        System.out.println("Question 9b:");
        System.out.println("A LinkedList avoids resizing because it does not store elements in a contiguous array.");
        System.out.println("Instead, it stores elements in nodes where each node contains the element itself and references (links) to the previous and next nodes.");
        System.out.println("These links allow the list to grow and shrink dynamically without the need to copy or resize.");
        System.out.println("Adding or removing elements involves changing these node links, which is done in constant time (O(1)) when the position is known.");
    }
}

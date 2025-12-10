package org.vanier.assignments.assignment3;

/*
Assignment #3: The Use of Data Structures (Stack, Queue, Binary Tree) and Recursion

Task 3 - Queue: Enqueue & Dequeue

Implement a queue of strings.
Enqueue "Alice", "Bob", "Carol".
Dequeue and print each name until the queue is empty.
What is the output order? (Explain FIFO principle.)
*/

import java.util.LinkedList;
import java.util.Queue;

public class Task3 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Enqueue names
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Carol");

        System.out.println("Dequeuing names from the queue:");

        // Dequeue and print until the queue is empty
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // Explanation
        System.out.println("\nExplanation:");
        System.out.println("The output is in the same order as insertion because Queue is FIFO (First In, First Out).");
        System.out.println("So, 'Alice' was added first and is the first to be removed.");
    }
}


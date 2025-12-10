package org.vanier.assignments.assignment1;

/**
 * Question 7: Using LinkedList as a Queue (10 Marks)
 * a. (5 Marks) Create a LinkedList to simulate a queue of print jobs. Add "Document A", "Document B", and "Document C" to the queue using appropriate Queue methods.
 * b. (5 Marks) Write code to process (remove) and print each print job from the queue until it is empty. Show the state of the queue (or elements printed) after each processing step.
 */

import java.util.LinkedList;
import java.util.Queue;

public class Task7 {
    public static void main(String[] args) {
        // a) Create LinkedList to simulate a queue of print jobs
        Queue<String> printQueue = new LinkedList<>();
        printQueue.add("Document A");
        printQueue.add("Document B");
        printQueue.add("Document C");

        System.out.println("Initial queue: " + printQueue);

        // b) Process and print each print job until queue is empty
        while (!printQueue.isEmpty()) {
            String job = printQueue.poll();  // Removes and returns the head
            System.out.println("Processing print job: " + job);
            System.out.println("Queue after processing: " + printQueue);
        }
    }
}


package org.vanier.labs.lab8;

/*
 * Lab: Problem Solving with MyQueue
 *
 * 4. Simulate Print Queue Processing
 * Write a method to simulate a printer queue:
 * Enqueue a series of print jobs (strings like "Doc1", "Doc2", ...).
 * Process jobs by dequeueing and printing the job name until the queue is empty.
 * Print both the order jobs enter and the order they’re processed.
 * Discuss how queues naturally model fair “first-come, first-served” systems.
 */

import java.util.LinkedList;
import java.util.NoSuchElementException;

// Custom generic queue class using LinkedList
class MyQueue4<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Adds an item to the end of the queue
    public void enqueue(T value) {
        list.addLast(value);
    }

    // Removes and returns the item at the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.removeFirst();
    }

    // Returns the item at the front without removing it
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.getFirst();
    }

    // Returns true if the queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Returns the number of elements in the queue
    public int size() {
        return list.size();
    }
}

public class Task4 {

    // Simulates a printer queue: enqueue jobs, then process them
    public static void simulatePrintQueue() {
        MyQueue<String> printQueue = new MyQueue<>();

        // Enqueue print jobs
        String[] jobs = {"Doc1", "Doc2", "Doc3", "Doc4"};
        System.out.println("Jobs added to the print queue:");
        for (String job : jobs) {
            printQueue.enqueue(job);
            System.out.println("Enqueued: " + job);
        }

        System.out.println("\nProcessing print jobs (in order received):");
        // Process jobs using FIFO - first job enqueued is the first printed
        while (!printQueue.isEmpty()) {
            String job = printQueue.dequeue();
            System.out.println("Printing: " + job);
        }

        // The queue ensures that jobs are processed in the same order they arrived.
        System.out.println("\nAll jobs processed in the order they were received.");
    }

    public static void main(String[] args) {
        simulatePrintQueue();
    }
}

/** Discuss how queues naturally model fair “first-come, first-served” systems:
 *
 * Queues follow the FIFO (First-In, First-Out) principle, which means the first element added
 * to the queue will be the first one removed. This directly reflects fairness in real-world
 * scenarios where people or tasks are handled in the order they arrive.
 *
 * In a print queue, for example, the first document submitted should be the first one printed.
 * Queues ensure no job is skipped or unfairly delayed, making them ideal for modeling systems
 * like printer processing, checkout lines, call center support, and more — all of which rely on
 * fairness and predictability in order of service.
 */
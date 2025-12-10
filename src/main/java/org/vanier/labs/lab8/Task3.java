package org.vanier.labs.lab8;

/*
 * Lab: Problem Solving with MyQueue
 *
 * 3. Check the Next in Line
 * After enqueuing several items (for example: 1, 2, 3),
 * use the peek() method to print the item at the front of the queue without removing it.
 * Confirm that after peek(), the value is still in the queue (try dequeueing afterwards to verify).
 */

import java.util.LinkedList;
import java.util.NoSuchElementException;

// Custom generic queue class using LinkedList
class MyQueue3<T> {
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

    // Returns the item at the front of the queue without removing it
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.getFirst();
    }

    // Checks if the queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Returns the number of items in the queue
    public int size() {
        return list.size();
    }
}

public class Task3 {
    public static void main(String[] args) {
        // Create a queue for integers
        MyQueue<Integer> queue = new MyQueue<>();

        // Enqueue some items: 1, 2, 3
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Use peek() to look at the front item without removing it
        System.out.println("Peeked value (should be 1): " + queue.peek());

        // Confirm the peeked value is still in the queue by dequeuing next
        System.out.println("Dequeued value (should still be 1): " + queue.dequeue());

        // Continue dequeuing to show remaining values
        System.out.println("Dequeued value: " + queue.dequeue()); // should be 2
        System.out.println("Dequeued value: " + queue.dequeue()); // should be 3
    }
}

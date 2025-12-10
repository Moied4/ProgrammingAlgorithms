package org.vanier.assignments;

import java.util.EmptyStackException;
import java.util.Stack;

/**Core Operations:
 enqueue(element): Adds an element to the rear (or tail) of the queue.
 dequeue(): Removes and returns the front (or head) element from the queue.
 peek(): Returns the front element without removing it.
 isEmpty(): Checks if the queue is empty.
 size(): Returns the number of elements in the queue.
 */

public class MyQueue {

    private static Stack<String> inbox = new Stack<>();
    private static Stack<String> outbox = new Stack<>();

    public static void main(String[] args) {
        enqueue("docA");
        enqueue("docB");
        enqueue("docC");

        System.out.println("isEmpty() = " + isEmpty());
        System.out.println("size() = " + size());
        System.out.println("peek() = " + peek());
        System.out.println("dequeue() = " + dequeue());
    }

    // Adds an element to the rear of the queue
    public static void enqueue(String str) {
        inbox.push(str);
    }

    // Removes and returns the front element from the queue
    public static String dequeue() {
        if (isEmpty()) throw new EmptyStackException();
        move();
        return outbox.pop();
    }

    // Moves elements from inbox to outbox if outbox is empty
    private static void move() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
    }

    // Returns the number of elements in the queue
    public static int size() {
        return inbox.size() + outbox.size();
    }

    // Checks if the queue is empty
    public static boolean isEmpty() {
        return inbox.isEmpty() && outbox.isEmpty();
    }

    // Returns the front element without removing it
    public static String peek() {
        if (isEmpty()) throw new EmptyStackException();
        move();
        return outbox.peek();
    }
}

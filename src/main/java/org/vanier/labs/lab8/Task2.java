package org.vanier.labs.lab8;

/*
 * Lab: Problem Solving with MyQueue
 *
 * 2. Process People in a Line
 * Suppose five people arrive one after another (Alice, Bob, Carol, Dave, Eve).
 * Enqueue their names as strings.
 * Serve them using dequeue and print each name as they are served.
 * What is the order in which they are served?
 */

import java.util.LinkedList;
import java.util.NoSuchElementException;

// Custom generic queue class using LinkedList
class MyQueue2<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Enqueue adds an element to the end of the queue
    public void enqueue(T value) {
        list.addLast(value);
    }

    // Dequeue removes and returns the element at the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.removeFirst();
    }

    // Peek returns the front element without removing it
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

public class Task2 {
    public static void main(String[] args) {
        // Create a queue for people standing in line
        MyQueue<String> line = new MyQueue<>();

        // Enqueue the names in the order people arrive
        line.enqueue("Alice");
        line.enqueue("Bob");
        line.enqueue("Carol");
        line.enqueue("Dave");
        line.enqueue("Eve");

        // This loop demonstrates FIFO (First-In, First-Out):
        // The first person who arrives (Alice) is served first.
        // The last person (Eve) is served last.
        while (!line.isEmpty()) {
            System.out.println(line.dequeue());
        }
    }
}

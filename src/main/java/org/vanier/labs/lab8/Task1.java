package org.vanier.labs.lab8;

/*
 * Lab: Problem Solving with MyQueue
 *
 * 1. Enqueue & Dequeue Demo
 * Create a MyQueue.
 * Enqueue the numbers 7, 14, and 21 (in that order).
 * Dequeue and print all values from the queue until it is empty.
 * What is the printed output?
 * Briefly explain your result in terms of the queue’s FIFO (First-In-First-Out) principle.
 */

import java.util.LinkedList;
import java.util.NoSuchElementException;

class MyQueue<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void enqueue(T value) {
        list.addLast(value);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}

public class Task1 {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        // Enqueue values
        queue.enqueue(7);
        queue.enqueue(14);
        queue.enqueue(21);

        // This loop demonstrates FIFO (First-In, First-Out):
        // The first number added to the queue (7) is the first to come out.
        // Then 14 comes out next, followed by 21 — exactly in the order they were enqueued.
        // This behavior confirms that the queue processes elements in the order they arrive.
        // Dequeue and print values
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}


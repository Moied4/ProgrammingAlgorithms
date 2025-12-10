package org.vanier.labs.lab3;

/**
 *5. LinkedList as a Queue/Deque:
 *Demonstrate LinkedList as a Queue (First-In, First-Out).
 *Create a LinkedList<String> called taskQueue.
 *Add "Task A", "Task B", "Task C" using offer().
 *Simulate processing tasks by repeatedly using poll() and printing the removed task until the queue is empty.
 *Demonstrate LinkedList as a Stack (Last-In, First-Out).
 *Create a LinkedList<Integer> called numberStack.
 *Add 10, 20, 30 using push().
 *Simulate popping elements by repeatedly using pop() and printing the removed number until the stack is empty.
 */

import java.util.LinkedList;

public class Task5 {
    public static void main(String[] args) {

        // LinkedList as a Queue (FIFO)
        LinkedList<String> taskQueue = new LinkedList<>();

        // Add tasks using offer()
        taskQueue.offer("Task A");
        taskQueue.offer("Task B");
        taskQueue.offer("Task C");

        System.out.println("Processing tasks in FIFO order (Queue):");
        while (!taskQueue.isEmpty()) {
            // Remove and print tasks using poll()
            String task = taskQueue.poll();
            System.out.println("Processed: " + task);
        }

        System.out.println();  // Empty line for readability

        // LinkedList as a Stack (LIFO)
        LinkedList<Integer> numberStack = new LinkedList<>();

        // Add numbers using push()
        numberStack.push(10);
        numberStack.push(20);
        numberStack.push(30);

        System.out.println("Processing numbers in LIFO order (Stack):");
        while (!numberStack.isEmpty()) {
            // Remove and print numbers using pop()
            int number = numberStack.pop();
            System.out.println("Popped: " + number);
        }
    }
}




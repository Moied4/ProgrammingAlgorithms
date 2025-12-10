package org.vanier.assignments.assignment3;

/*
Assignment #3: The Use of Data Structures (Stack, Queue, Binary Tree) and Recursion

Task 4 - Peek Front

After enqueuing integers 7, 8, 9, use the peek operation to show the item at the front without removing it.
Confirm it remains after peeking by dequeueing and printing.
*/

import java.util.LinkedList;
import java.util.Queue;

public class Task4 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue integers
        queue.offer(7);
        queue.offer(8);
        queue.offer(9);

        // Peek at the front item
        Integer front = queue.peek();
        System.out.println("Peeked front item (without removing): " + front);

        // Confirm it remains in the queue by dequeuing all items
        System.out.println("\nDequeuing all items:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // Explanation
        System.out.println("\nExplanation:");
        System.out.println("The peek() method returns the front of the queue without removing it.");
        System.out.println("So after peeking, 7 is still at the front and gets dequeued first.");
    }
}

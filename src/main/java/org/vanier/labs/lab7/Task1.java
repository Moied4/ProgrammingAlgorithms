package org.vanier.labs.lab7;

/*
 * Lab: Problem Solving with MyStack
 *
 * Task 1: Stack Push & Pop Demo
 *
 * Write a short snippet using your MyStack:
 * - Push the numbers 2, 4, then 6 onto the stack (in that order).
 * - Pop and print all values from the stack until it is empty.
 * - What is the printed output?
 * - Briefly explain your result in terms of the stack’s LIFO principle.
 */

import org.vanier.lists.stacks.MyStack;

public class Task1 {
    public static void main(String[] args) {
        MyStack stack = new MyStack(); // Create an instance of MyStack

        // Push numbers onto the stack in the given order
        stack.push("2");
        stack.push("4");
        stack.push("6");

        // Pop and print all elements until the stack is empty
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

/*
 * Expected Output:
 * 6
 * 4
 * 2
 *
 * Explanation:
 * A stack follows the LIFO principle — Last In, First Out.
 * This means the most recently added element is the first to be removed.
 *
 * In this example:
 * - "2" was pushed first, then "4", then "6".
 * - When popping, "6" comes out first, followed by "4", then "2".
 *
 * This confirms the correct LIFO behavior of the MyStack implementation.
 */

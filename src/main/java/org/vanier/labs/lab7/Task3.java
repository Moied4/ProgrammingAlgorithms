package org.vanier.labs.lab7;

import org.vanier.lists.stacks.MyStack;

/*
 * Lab: Problem Solving with MyStack
 *
 * Task 3: Reverse an Array Using Stack
 *
 * Given an array of integers, use your Stack class to print the elements in reverse order.
 *
 * Example:
 * Input: [1, 2, 3, 4]
 * Output: 4 3 2 1
 */

public class Task3 {

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4};

        // Create a stack to hold string representations of the integers
        MyStack stack = new MyStack();

        // Push all elements onto the stack
        for (int num : inputArray) {
            stack.push(String.valueOf(num));
        }

        // Pop and print elements to reverse the order
        System.out.print("Reversed output: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println(); // New line after output
    }
}

/*
 * Explanation:
 *
 * A stack is a LIFO (Last-In, First-Out) structure.
 * - We push elements 1, 2, 3, 4 onto the stack (in that order).
 * - Then we pop each element and print it.
 *
 * This gives the output: 4 3 2 1
 *
 * This technique is useful for reversing sequences using only stack operations.
 */

package org.vanier.assignments.assignment3;

/*
Assignment #3: The Use of Data Structures (Stack, Queue, Binary Tree) and Recursion

Stack - Push & Pop Integers

Implement a stack of integers.
Push 5, 10, 20 onto the stack (in order).
Pop and print all elements until the stack is empty.
What is the output order? (Explain why.)
*/

import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(5);
        stack.push(10);
        stack.push(20);

        System.out.println("Popping elements from the stack:");

        // Pop and print until stack is empty
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Explanation
        System.out.println("\nExplanation:");
        System.out.println("The output is in reverse order of insertion because Stack is LIFO (Last In, First Out).");
        System.out.println("So, 20 was the last pushed, and it is the first to be popped.");
    }
}

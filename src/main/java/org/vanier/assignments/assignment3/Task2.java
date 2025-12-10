package org.vanier.assignments.assignment3;

/*
Assignment #3: The Use of Data Structures (Stack, Queue, Binary Tree) and Recursion

Task 2 - Undo Functionality Simulation

Simulate a simple undo feature:
Push a series of string actions onto a stack (e.g., "TypeA", "TypeB", "Delete", "InsertC").
“Undo” the last two actions by popping from the stack and printing each step.
*/

import java.util.Stack;

public class Task2 {
    public static void main(String[] args) {
        Stack<String> actionStack = new Stack<>();

        // Push a series of actions onto the stack
        actionStack.push("TypeA");
        actionStack.push("TypeB");
        actionStack.push("Delete");
        actionStack.push("InsertC");

        System.out.println("Undoing last two actions:");

        // Undo last two actions
        for (int i = 0; i < 2; i++) {
            if (!actionStack.isEmpty()) {
                String undoneAction = actionStack.pop();
                System.out.println("Undid action: " + undoneAction);
            }
        }
    }
}

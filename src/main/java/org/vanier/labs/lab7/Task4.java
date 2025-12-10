package org.vanier.labs.lab7;

import org.vanier.lists.stacks.MyStack;

/*
 * Lab: Problem Solving with MyStack
 *
 * Task 4: Balanced Parentheses Checker
 *
 * Write a method using MyStack that checks if a string containing only '(' and ')' is “balanced.”
 *
 * Example:
 * "(()())" → true
 * "((())" → false
 *
 * Approach:
 * - Push for each '('
 * - Pop for each ')'
 * - If at any point you pop when the stack is empty → unbalanced
 * - If stack is not empty at the end → unbalanced
 */

public class Task4 {

    // Method to check if a string has balanced parentheses
    public static boolean isBalanced(String expression) {
        MyStack stack = new MyStack();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(') {
                stack.push("(");  // Push for opening parenthesis
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false; // No matching opening parenthesis
                }
                stack.pop(); // Pop a matching '('
            }
        }

        // If stack is empty, all parentheses were matched
        return stack.isEmpty();
    }

    // Main method to test with examples
    public static void main(String[] args) {
        String[] testCases = {
                "(()())",     // balanced
                "((())",      // unbalanced
                "())(",       // unbalanced
                "",           // balanced
                "((()))()"    // balanced
        };

        for (String test : testCases) {
            System.out.println("\"" + test + "\" → Balanced? " + isBalanced(test));
        }
    }
}

/*
 * Explanation:
 *
 * This program uses the MyStack class to track open parentheses.
 * - For each '(', we push to the stack.
 * - For each ')', we try to pop from the stack.
 * - If the stack is empty when we try to pop, it means there was no matching '(' — unbalanced.
 * - If the stack still has items at the end, it means there are unmatched '(' — also unbalanced.
 *
 * Sample Output:
 * "(()())" → Balanced? true
 * "((())"  → Balanced? false
 * "())("   → Balanced? false
 * ""       → Balanced? true
 * "((()))()" → Balanced? true
 */

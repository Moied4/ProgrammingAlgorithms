package org.vanier.labs.lab7;

import org.vanier.lists.stacks.MyStack;

/*
 * Lab: Problem Solving with MyStack
 *
 * Task 2: Check for Palindrome Using Stack
 *
 * Write a method that uses your MyStack to check if a given word
 * (e.g., "level", "noon", "java") is a palindrome.
 *
 * (Push all characters, then pop to reverse and compare with original.)
 */

public class Task2 {

    // Method to check if a given word is a palindrome using MyStack
    public static boolean isPalindrome(String word) {
        MyStack stack = new MyStack();

        // Push each character of the word onto the stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(String.valueOf(word.charAt(i)));
        }

        // Pop characters to build the reversed word
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        // Compare original word with the reversed version
        return word.equals(reversed.toString());
    }

    // Main method to test several examples
    public static void main(String[] args) {
        String[] testWords = { "level", "noon", "java", "madam", "hello" };

        for (String word : testWords) {
            boolean result = isPalindrome(word);
            System.out.println(word + " → Palindrome? " + result);
        }
    }
}

/*
 * Explanation:
 *
 * This program uses the MyStack class to reverse the input word.
 * By pushing all characters and then popping them, we reverse the string.
 * If the reversed string is equal to the original, it's a palindrome.
 *
 * Sample Output:
 * level → Palindrome? true
 * noon → Palindrome? true
 * java → Palindrome? false
 * madam → Palindrome? true
 * hello → Palindrome? false
 *
 * This demonstrates the practical use of a stack's LIFO nature to reverse strings.
 */


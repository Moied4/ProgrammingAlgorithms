package org.vanier.assignments.assignment3;

/*
Assignment #3: The Use of Data Structures (Stack, Queue, Binary Tree) and Recursion

Task 7 - Recursive Sum of Array Elements

Write a recursive method that takes an array of integers and returns the sum of all elements.
Test your method with the array {3, 5, 7, 9} and print the result.
*/

public class Task7 {

    // Recursive method to sum elements of an array
    static int recursiveSum(int[] arr, int index) {
        if (index == arr.length) {
            return 0; // Base case: past the end of the array
        }
        return arr[index] + recursiveSum(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 9};

        int sum = recursiveSum(numbers, 0);
        System.out.println("Sum of array elements: " + sum);
    }
}

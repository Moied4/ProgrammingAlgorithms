package org.vanier.labs.lab5;

/**
 **Task 3: Real-World Scenario to Big-O Mapping **
 *Description: Match each real-world task description with the Big-O notation that best represents its efficiency, considering n as the input size. Explain your reasoning briefly.
 *Tasks & Big-O Options:
 *Tasks:
 *Calling the first person in a phone book of n contacts.
 *Searching for a specific book title in an unsorted library of n books.
 *Finding the shortest route that visits all n cities exactly once (Traveling Salesperson Problem, brute-force approach).
 *Doubling the storage capacity of an existing dynamic array (like ArrayList) when it runs out of space, which requires copying all n current elements.
 *Big-O Options: O(1), O(n), O(n!), O(n) (worst-case for specific operation)
 *Expected Answer Format: "Task X: Big-O (Reasoning: ...)"
 */

public class Task3 {
    public static void main(String[] args) {
        System.out.println("**Task 3: Real-World Scenario to Big-O Mapping**");
        System.out.println();

        System.out.println("Task 1: O(1) (Reasoning: Accessing the first contact is a direct operation, not dependent on size n)");
        System.out.println("Task 2: O(n) (Reasoning: You may need to search through each book in the worst case)");
        System.out.println("Task 3: O(n!) (Reasoning: Brute-force TSP checks all permutations of cities — factorial time)");
        System.out.println("Task 4: O(n) (Reasoning: Doubling capacity requires copying all existing n elements)");
    }
}
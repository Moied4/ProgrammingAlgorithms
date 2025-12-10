package org.vanier.labs.lab5;

/**
 **Task 2: Dominant Term Identification **
 *Description: Given an algorithm's total operation count expressed as a function of input size n, determine its Big-O notation by identifying and simplifying the dominant term.
 *Functions:
 *
 * 5n+100
 * n^2+3n+50
 * 10logn+2n
 * 2^n+n^2

 Expected Answer Format: For each function, state its Big-O (e.g., "1. O(n)").
 */

public class Task2 {
    public static void main(String[] args) {
        System.out.println("**Task 2: Dominant Term Identification**");
        System.out.println();

        System.out.println("1. 5n + 100 => O(n)");
        System.out.println("2. n^2 + 3n + 50 => O(n^2)");
        System.out.println("3. 10logn + 2n => O(n)");
        System.out.println("4. 2^n + n^2 => O(2^n)");
    }
}

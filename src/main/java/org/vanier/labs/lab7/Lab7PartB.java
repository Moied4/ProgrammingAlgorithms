package org.vanier.labs.lab7;

import org.vanier.lists.stacks.MyStack;

/*
 * Lab 7 Part B: Exploring Recursion
 *
 * Tasks:
 * 1. factorial(int n) - recursive factorial calculation
 * 2. sumN(int n) - sum of first n natural numbers recursively
 * 3. multinomialTerms(int n, int k) - recursive count of multinomial terms
 * 4. reverseString(String s) - recursive string reversal
 */

public class Lab7PartB {

    // 1. Recursive factorial method
    public static int factorial(int n) {
        System.out.println("factorial called with n = " + n); // trace recursive calls
        if (n <= 1) { // base case: factorial(0) = 1 and factorial(1) = 1
            return 1; // stop recursion and return 1
        }
        return n * factorial(n - 1); // recursive call reducing n by 1
    }

    // 2. Recursive sum of first n natural numbers
    public static int sumN(int n) {
        System.out.println("sumN called with n = " + n); // trace recursive calls
        if (n <= 0) { // base case: sum of 0 or negative is 0
            return 0; // stop recursion and return 0
        }
        return n + sumN(n - 1); // recursive call adding n to sum of n-1
    }

    // 3. Recursive multinomial terms count
    // A(n, k) = A(n, k-1) + A(n-1, k)
    // Base cases: A(n, 1) = 1 and A(0, k) = 1
    public static int multinomialTerms(int n, int k) {
        System.out.println("multinomialTerms called with n = " + n + ", k = " + k); // trace calls
        if (k == 1 || n == 0) { // base cases
            return 1; // return 1 when k = 1 or n = 0
        }
        // recursive calls: sum of multinomialTerms with k-1 and n-1 respectively
        return multinomialTerms(n, k - 1) + multinomialTerms(n - 1, k);
    }

    // 4. Recursive string reversal
    public static String reverseString(String s) {
        System.out.println("reverseString called with s = \"" + s + "\""); // trace calls
        if (s.isEmpty() || s.length() == 1) { // base case: empty or single-char string
            return s; // return string itself (stop recursion)
        }
        // recursive call on substring excluding first char, then append first char at the end
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    // Main method to test all tasks
    public static void main(String[] args) {
        System.out.println("=== Factorial of 5 ===");
        int fact5 = factorial(5); // compute factorial of 5 recursively
        System.out.println("Result: " + fact5); // print result

        System.out.println("\n=== Sum of first 10 natural numbers ===");
        int sum10 = sumN(10); // compute sum of 1 to 10 recursively
        System.out.println("Result: " + sum10); // print result

        System.out.println("\n=== Multinomial Terms for (4, 3) ===");
        int multinomial = multinomialTerms(4, 3); // compute multinomial terms for n=4, k=3
        System.out.println("Result: " + multinomial); // print result

        System.out.println("\n=== Reverse string 'recursion' ===");
        String reversed = reverseString("recursion"); // reverse the string recursively
        System.out.println("Result: " + reversed); // print reversed string
    }
}


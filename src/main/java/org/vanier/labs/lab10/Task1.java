package org.vanier.labs.lab10;

// Task 1: Generics
// Write a generic Pair class that stores two elements of types T and U.
// Create a Pair for name and age, set values, and print them.

public class Task1 {

    // Generic Pair class with type parameters T and U
    public static class Pair<T, U> {
        private T first;   // First element
        private U second;  // Second element

        // Constructor to initialize both elements
        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        // Getter for first element
        public T getFirst() {
            return first;
        }

        // Getter for second element
        public U getSecond() {
            return second;
        }

        // Method to print both elements
        public void printPair() {
            System.out.println("First: " + first + ", Second: " + second);
        }
    }

    public static void main(String[] args) {
        // Create a Pair with String (name) and Integer (age)
        Pair<String, Integer> person = new Pair<>("Masimo Anil", 22);

        // Print the values
        person.printPair();  // Output: First: Masimo Anil, Second: 22

        // "first" holds the name
        // "second" holds the age
    }
}

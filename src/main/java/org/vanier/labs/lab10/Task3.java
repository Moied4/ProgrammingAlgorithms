package org.vanier.labs.lab10;

// Task 3: TreeSet
// Create a TreeSet, add: 5, 2, 8, 2, 3.
// Print all elements. What order do you see—why?

import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {
        // Create a TreeSet of Integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements to the TreeSet
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(2);  // Duplicate; will be ignored
        numbers.add(3);

        // Print all elements
        System.out.println("TreeSet contents: " + numbers);

        // Explanation:
        // TreeSet stores elements in sorted (natural) order.
        // It also does not allow duplicates.
        // So even though we added 2 twice, it appears only once.
        // The elements are automatically sorted: [2, 3, 5, 8]
    }
}


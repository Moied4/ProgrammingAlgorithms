package org.vanier.labs.lab10;

// Task 5: TreeMap
// Insert the pairs ("red", 1), ("blue", 5), ("green", 3) into a TreeMap.
// Print the map. What is the order of the keys?

import java.util.TreeMap;

public class Task5 {
    public static void main(String[] args) {
        // Create a TreeMap to store String keys and Integer values
        TreeMap<String, Integer> colorMap = new TreeMap<>();

        // Insert key-value pairs into the TreeMap
        colorMap.put("red", 1);
        colorMap.put("blue", 5);
        colorMap.put("green", 3);

        // Print the TreeMap
        System.out.println("TreeMap contents: " + colorMap);

        // Explanation:
        // TreeMap stores keys in natural sorted order (alphabetical for Strings).
        // So keys will be printed in alphabetical order: "blue", "green", "red".
    }
}


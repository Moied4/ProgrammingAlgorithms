package org.vanier.labs.lab10;

// Task 4: HashMap
// Given the string "banana", use a HashMap<Character, Integer> to count the frequency of each character.
// Print the map so it shows each character and its count.
// input: "banana" --> output: b1a3n2

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        String input = "banana";

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Loop through each character in the string
        for (char ch : input.toCharArray()) {
            // If character is already in map, increment count
            if (frequencyMap.containsKey(ch)) {
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                // Otherwise, add it with count 1
                frequencyMap.put(ch, 1);
            }
        }

        // Print the full map
        System.out.println("Character Frequencies: " + frequencyMap);

        // Optional: Print in compact format like b1a3n2
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch).append(frequencyMap.get(ch));
            }
        }

        System.out.println("Formatted output: " + result.toString());

        // Explanation:
        // 'b' appears 1 time, 'a' appears 3 times, 'n' appears 2 times.
        // HashMap stores frequencies, and we build a formatted string based on first appearance.
    }
}


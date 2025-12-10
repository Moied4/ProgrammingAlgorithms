package org.vanier.labs.lab5;

/**
 * Task 5: Choosing the Right Data Structure
 *
 * Description:
 * For each application scenario, recommend whether an ArrayList or LinkedList
 * would be the more efficient choice. Justify your answer based on their Big-O
 * performance characteristics.
 *
 * Scenarios:
 * Scenario A: A music player maintaining a playlist where users frequently jump
 *             to a specific song by its number in the list and occasionally add new songs to the end.
 *
 * Scenario B: An undo/redo functionality in a text editor where operations are
 *             constantly added to the end and removed from either the beginning or end of a history stack.
 *
 * Expected Answer Format:
 * "Scenario A: [Data Structure Name] because [Justification referencing Big-O]."
 * "Scenario B: [Data Structure Name] because [Justification referencing Big-O]."
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println("Scenario A: ArrayList because it provides O(1) time for random access (jumping to a song by index) and amortized O(1) for adding at the end.");

        System.out.println("Scenario B: LinkedList because it provides O(1) time for adding/removing elements at both ends, which suits undo/redo operations where elements are frequently added/removed from start or end.");
    }
}


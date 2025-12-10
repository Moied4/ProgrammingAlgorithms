package org.vanier.assignments.assignment1;

/**
 * Question 8: Choosing the Right Data Structure (10 Marks)
 * For each of the following scenarios, recommend whether an Array, ArrayList, or LinkedList would be the most appropriate data structure in Java and explain why your choice is optimal.
 * a. (3 Marks) Storing a fixed number of sensor readings (e.g., 100 readings) where you frequently need to access data by its index.
 * b. (3 Marks) Managing a playlist of songs where songs are frequently added to the beginning or end, and you rarely jump to a specific song by its number.
 * c. (4 Marks) Maintaining a list of registered users for a website, where new users are added constantly, and existing users might be removed, but you also need to occasionally search for a user by their username (not by index).
 */

public class Task8 {

    public static void main(String[] args) {

        // a) Storing a fixed number of sensor readings (e.g., 100 readings)
        // where you frequently need to access data by its index.
        System.out.println("Scenario a:");
        System.out.println("Recommended Data Structure: Array");
        System.out.println("Explanation:");
        System.out.println("- The number of readings is fixed (100), so a fixed-size data structure fits perfectly.");
        System.out.println("- Arrays provide fast, constant-time access to elements by index, which is needed here.");
        System.out.println("- No need for dynamic resizing or frequent additions/removals.");
        System.out.println();

        // b) Managing a playlist of songs where songs are frequently added to the beginning or end,
        // and you rarely jump to a specific song by its number.
        System.out.println("Scenario b:");
        System.out.println("Recommended Data Structure: LinkedList");
        System.out.println("Explanation:");
        System.out.println("- Songs are frequently added at the start or end — LinkedList allows fast insertions/removals at both ends (O(1)).");
        System.out.println("- Random access by index is rare, so slower indexed access in a LinkedList is not a problem.");
        System.out.println("- ArrayList would be inefficient for front insertions because it requires shifting elements.");
        System.out.println();

        // c) Maintaining a list of registered users for a website, where new users are added constantly,
        // and existing users might be removed, but you also need to occasionally search for a user by their username (not by index).
        System.out.println("Scenario c:");
        System.out.println("Recommended Data Structure: ArrayList");
        System.out.println("Explanation:");
        System.out.println("- Frequent adds/removes can be handled reasonably well by ArrayList, especially if removals are not excessive or not always in the middle.");
        System.out.println("- Occasional searches by username require iterating over elements, which is simpler with ArrayList.");
        System.out.println("- LinkedList offers no advantage here since search still requires traversal.");
        System.out.println("- For efficient username search, a HashMap or TreeMap would be better, but among the given options, ArrayList is more flexible for general management.");
    }
}

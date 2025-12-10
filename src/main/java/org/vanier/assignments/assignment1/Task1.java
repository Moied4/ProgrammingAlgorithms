package org.vanier.assignments.assignment1;

/**
 *Question 1: Array Fundamentals (10 Marks)
 *Given the integer array: int[] data = {15, 22, 10, 30, 5, 28};
 *a. (3 Marks) Write Java code to find and print the minimum value in the data array.
 *b. (4 Marks) Create a new array called filteredData and populate it with all numbers from the data array that are greater than 20. Print the filteredData array.
 *c. (3 Marks) Explain in your own words: What does it mean for an array to be a fixed-size data structure?
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] data = {15, 22, 10, 30, 5, 28};

        // Part (a): Find and print minimum value
        int min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        System.out.println("Minimum value: " + min);

        // Part (b): Filter values > 20 and print them
        ArrayList<Integer> filteredList = new ArrayList<>();
        for (int num : data) {
            if (num > 20) {
                filteredList.add(num);
            }
        }

        int[] filteredData = new int[filteredList.size()];
        for (int i = 0; i < filteredList.size(); i++) {
            filteredData[i] = filteredList.get(i);
        }

        System.out.println("Filtered data (values > 20): " + Arrays.toString(filteredData));
    }
}

//  Part (c): Explanation: Fixed-size array
// In Java, an array is called a fixed-size data structure because its size is determined when it is created
// and cannot be changed later. This means once you allocate space for an array, you can't add or remove
// elements directly. To work around this limitation, dynamic structures like ArrayList are often used when
// the number of elements may change.


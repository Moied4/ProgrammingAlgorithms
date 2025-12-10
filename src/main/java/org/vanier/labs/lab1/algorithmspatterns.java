package org.vanier.labs.lab1.lab4;

/**
 *1.Array Declaration and Initialization:
 * Declare an integer array named scores of size 5 and initialize it with any five integer values between 0 and 100.
 * Declare a String array named daysOfWeek and initialize it directly with the names of the seven days of the week.
 */

public class algorithmspatterns {
    public static void main(String[] args) {
        int[] scores = new int[5];
        scores[0] = 80;
        scores[1] = 90;
        scores[2] = 80;
        scores[3] = 90;
        scores[4] = 80;

        String[] daysOfWeek = new String[]{
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };

        /**
         *2.Accessing and Modifying Elements:
         *Print the third element of the scores array.
         *Change the value of the first element in the scores array to 100 and print it.
         *Print the last element of the daysOfWeek array.
         */

        System.out.println("Third score: " + scores[2]);
        scores[0] = 100;
        System.out.println("Updated first score: " + scores[0]);
        System.out.println("Last day of the week: " + daysOfWeek[daysOfWeek.length - 1]);


        /**
         *3. Iterating Through Arrays:
         *Use a for loop to print all elements of the scores array.
         *Use an enhanced for loop (for-each loop) to print all elements of the daysOfWeek array.
         */

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        for (String day : daysOfWeek) {
            System.out.println(day);
        }

        /**
         * 4. Array Length:
         * Print the length of both the scores array and the daysOfWeek array.
         */

        System.out.println("Length of scores array: " + scores.length);
        System.out.println("Length of daysOfWeek array: " + daysOfWeek.length);

        /**
         * 5. New Tasks with nums Array:
         * Given an array of integer numbers: int[] nums = {5, 7, 8, 10, 17, 24, 31, 36};
         * Task 1: Find the maximum value. Write code to find and print the maximum value in the nums array.
         * Task 2: Find the sum. Calculate and print the sum of all elements in the nums array.
         * Task 3: Assign even numbers to a new array. Create a new integer array called evens. Iterate through nums and assign all even numbers into the evens array. Print the evens array.
         */

        int[] nums = {5, 7, 8, 10, 17, 24, 31, 36};

// Task 1: Find the maximum value
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Maximum value: " + max);

// Task 2: Find the sum of all elements
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("Sum of all elements: " + sum);

// Task 3: Assign even numbers to a new array
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }

        int[] evens = new int[count];
        int index = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                evens[index++] = num;
            }
        }

        System.out.println("Even numbers in the array:");
        for (int even : evens) {
            System.out.println(even);
        }

        /**
         * 6. Conceptual Questions on Arrays:
         *    Question 1: Can you add or delete an integer to or from the nums array (the one defined in Task 5) after it has been created? Explain why or why not.
         *    Question 2: Can you create an array in Java like [1, 0, true, false]? Explain why or why not.
         */

        //1: No, you cannot directly add or delete elements from a standard Java array after it has been created.
        //   The array has a fixed length so if you want to resize, you must create a new array or use a dynamic structure like ArrayList

        //2: No, you cannot create an array in Java with mixed data types
        //  Java is a strongly typed language, which means every array must hold elements of a single, specific data type.
        //  The array [1, 0, true, false] mixes integers (1, 0) and booleans (true, false), which is not allowed in a standard Java array.

        /**
         * 7. Task 4: Student Data and Average Grade:
         * Make an array to store data for 5 students. Each student should have a first name (String) and a grade (double).
         * Calculate their average grade and print it. (Hint: You might need to consider how to store mixed data types in an array or if you need separate arrays for names and grades).
         */

        String[] studentNames = {"Alice", "Bob", "Charlie", "Diana", "Ethan"};
        double[] studentGrades = {85.5, 92.0, 78.5, 88.0, 91.5};

        double total = 0;
        for (double grade : studentGrades) {
            total += grade;
        }

        double average = total / studentGrades.length;
        System.out.println("Average grade: " + average);


        /**
         * 8. Optional Challenge: Searching in an Array:
         * Write a simple linear search algorithm to find if the number 50 exists in the scores array. Print a message indicating whether it was found or not.
         */

        int target = 50;
        boolean found = false;

        for (
                int i = 0;
                i < scores.length; i++) {
            if (scores[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number 50 was found in the scores array.");
        } else {
            System.out.println("Number 50 was NOT found in the scores array.");
        }
    }
}









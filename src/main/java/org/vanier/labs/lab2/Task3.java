package org.vanier.labs.lab2;

/**3. Adding and Removing Elements Dynamically:
 *Add "Grape" to the end of the fruits ArrayList.
 *Add "Banana" at index 1 in the fruits ArrayList. (Notice how this shifts subsequent elements).
 *Remove the fruit at index 3 from the fruits ArrayList. (Notice the shifting again).
 *Remove the first occurrence of the Integer value 20 (if it exists) from studentAges.
 *Add 100,000 random integers (between 0 and 1000) to a new ArrayList named largeList. Measure and print the time it takes for this operation. (Hint: Use System.nanoTime() before and after the loop).
*/
import java.util.ArrayList;
import java.util.Random;

    public class Task3 {
        public static void main(String[] args) {
            // Create and initialize fruits ArrayList
            ArrayList<String> fruits = new ArrayList<>();
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Cherry");
            fruits.add("Date");
            fruits.add("Raspberry");

            // Create and initialize studentAges ArrayList
            ArrayList<Integer> studentAges = new ArrayList<>();
            studentAges.add(18);
            studentAges.add(19);
            studentAges.add(20);
            studentAges.add(21);
            studentAges.add(22);

            // --- Task 3: Adding and Removing Elements Dynamically ---

            // 1. Add "Grape" to the end of the fruits ArrayList
            fruits.add("Grape");

            // 2. Add "Banana" at index 1 (shifts other elements)
            fruits.add(1, "Banana");

            // 3. Remove the fruit at index 3 (shifts elements again)
            fruits.remove(3);

            // 4. Remove the first occurrence of Integer value 20 (if it exists)
            studentAges.remove(Integer.valueOf(20));

            // 5. Add 100,000 random integers (0–1000) to largeList and measure time
            ArrayList<Integer> largeList = new ArrayList<>();
            Random rand = new Random();

            long startTime = System.nanoTime();

            for (int i = 0; i < 100_000; i++) {
                largeList.add(rand.nextInt(1001)); // 0 to 1000 inclusive
            }

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            // --- Output ---
            System.out.println("Updated fruits list: " + fruits);
            System.out.println("Updated studentAges list: " + studentAges);
            System.out.println("Time taken to add 100,000 integers to largeList: " + duration + " nanoseconds");
        }
    }



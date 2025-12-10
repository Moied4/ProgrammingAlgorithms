package org.vanier.labs.lab3;

/**3. Accessing Elements (Less Efficient Operations):
*Print the item at index 2 in the shoppingList using get(index). (Observe that this is still possible, but conceptually less efficient than in an ArrayList for large lists).
 *Print the first and last elements of the temperatures LinkedList using getFirst() and getLast().
 *Try to retrieve the element at index 50,000 from largeLinkedList using get(50000). Measure and print the time it takes. Compare this time to the time it took to add elements or to ArrayList's get() operation.
*/

import java.util.LinkedList;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        // Setup: create and populate shoppingList
        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("Eggs");
        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Cheese");
        shoppingList.add("Apples");
        shoppingList.addFirst("Yogurt");
        shoppingList.addLast("Orange Juice");
        shoppingList.removeFirst();
        shoppingList.removeLast();

        // Setup: create and populate temperatures list
        LinkedList<Double> temperatures = new LinkedList<>();
        temperatures.add(25.5);
        temperatures.add(30.1);
        temperatures.add(18.0);
        temperatures.add(27.3);
        temperatures.add(32.5);
        temperatures.addFirst(22.0);
        temperatures.removeLast();

        // Create largeLinkedList and populate with 100,000 random Doubles (timed)
        LinkedList<Double> largeLinkedList = new LinkedList<>();
        Random random = new Random();

        long startAdd = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            double value = 0.0 + (100.0 - 0.0) * random.nextDouble();
            largeLinkedList.addLast(value);
        }
        long endAdd = System.nanoTime();
        long addTimeNanos = endAdd - startAdd;

        // -----------------------------------------
        // 3. Accessing Elements (Less Efficient Operations):
        // -----------------------------------------

        // Print the item at index 2 in the shoppingList using get(index)
        String itemAtIndex2 = shoppingList.get(2);
        System.out.println("Item at index 2 in shoppingList: " + itemAtIndex2);
        System.out.println("(Note: Accessing by index in LinkedList is O(n) vs O(1) in ArrayList)");

        // Print the first and last elements of the temperatures LinkedList
        Double firstTemp = temperatures.getFirst();
        Double lastTemp = temperatures.getLast();
        System.out.println("First temperature: " + firstTemp);
        System.out.println("Last temperature: " + lastTemp);

        // Retrieve the element at index 50,000 in largeLinkedList (timed)
        long startGet = System.nanoTime();
        Double elementAt50000 = largeLinkedList.get(50000);
        long endGet = System.nanoTime();
        long getTimeNanos = endGet - startGet;

        System.out.println("Element at index 50,000 in largeLinkedList: " + elementAt50000);
        System.out.printf("Time to retrieve element at index 50,000: %d nanoseconds%n", getTimeNanos);

        // Also print add time for comparison
        System.out.printf("Time to add 100,000 elements: %d nanoseconds%n", addTimeNanos);

        // Comparison note
        System.out.println("Note: get(index) in LinkedList is slower than in ArrayList because it requires traversal from the head or tail.");
    }
}

package org.vanier.labs.lab13;

/**
 * Task 3 – Map Key Traversal
 * Create a HashMap (ID → Name).
 * Iterate over the keys using Iterator and print ID → Name.
 *
 * Goal: Traverse Map via keySet().iterator().
 */


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        // Step 1: Create a HashMap (ID → Name)
        Map<Integer, String> idNameMap = new HashMap<>();
        idNameMap.put(101, "Amine");
        idNameMap.put(102, "Bojan");
        idNameMap.put(103, "Donnie");
        idNameMap.put(104, "Anthony");
        idNameMap.put(105, "Eve");

        // Step 2: Iterate over keys using Iterator
        Iterator<Integer> keyIterator = idNameMap.keySet().iterator();

        System.out.println("ID → Name:");
        while (keyIterator.hasNext()) {
            Integer id = keyIterator.next();
            String name = idNameMap.get(id);
            System.out.println(id + " → " + name);
        }
    }
}


package org.vanier.labs.lab13;

/**
 * Task 4 – Map Entry Traversal
 * Using the same HashMap, iterate over entries using Iterator on entrySet() and print each pair.
 *
 * Goal: Understand Map.Entry with an iterator.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Map<Integer, String> idNameMap = new HashMap<>();
        idNameMap.put(101, "Amine");
        idNameMap.put(102, "Bojan");
        idNameMap.put(103, "Donnie");
        idNameMap.put(104, "Anthony");
        idNameMap.put(105, "Eve");
// Use entrySet().iterator() to iterate and print ID → Name
        Iterator<Map.Entry<Integer, String>> entryIterator = idNameMap.entrySet().iterator();

        System.out.println("ID → Name (using entrySet iterator):");
        while (entryIterator.hasNext()) {
            Map.Entry<Integer, String> entry = entryIterator.next();
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}


package org.vanier.labs.lab13;

/**
 * Task 1 – List Traversal
 * Create an ArrayList with 5 city names.
 * Use an Iterator to print each city name in order.
 *
 * Goal: Practice basic Iterator with List.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> cityNameList = new ArrayList<>();
        cityNameList.add("Montreal");
        cityNameList.add("Toronto");
        cityNameList.add("Ottawa");
        cityNameList.add("London");
        cityNameList.add("Miami");

        Iterator<String> iter = cityNameList.iterator();

        System.out.println("City names in order:");
        while (iter.hasNext()) {
            String cityName = iter.next();
            System.out.println(cityName);
        }

        System.out.println("\nCity names in alphabetical order:");
        System.out.println(cityNameList.stream().sorted().toList());
    }
}

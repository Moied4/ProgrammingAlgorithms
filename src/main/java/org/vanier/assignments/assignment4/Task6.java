package org.vanier.assignments.assignment4;

/**
 * Task 6: Sort a List of Custom Objects Using Comparator
 * Problem:
 * Define a simple Person class (fields: name String, age int). Write code to:
 *
 * Add several Person objects to a List
 * Sort the list first by age (ascending), then by name (alphabetically if ages are equal), using a custom Comparator.
 * Print the list before and after sorting.
 */


import java.util.*;

public class Task6 {

    // Person class with name and age
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // For readable output
        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Moe", 20));
        people.add(new Person("Ali", 30));
        people.add(new Person("Zara", 23));
        people.add(new Person("Liam", 33));
        people.add(new Person("Mina", 20));
        people.add(new Person("Zico", 24));

        System.out.println("Before sorting:");
        people.forEach(System.out::println);

        // Sort by age, then by name
        people.sort(Comparator
                .comparingInt((Person p) -> p.age)
                .thenComparing(p -> p.name));

        System.out.println("\nAfter sorting:");
        people.forEach(System.out::println);
    }
}


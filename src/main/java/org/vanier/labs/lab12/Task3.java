package org.vanier.labs.lab12;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Task 3: Sort Custom Objects
 * Create a Person class with name and age. Given a list of Person, use streams to sort by age ascending.
 *
 * List people = Arrays.asList(new Person("Alice", 30), new Person("Bob", 25));
 * List sorted = ;
 */

public class Task3 {

    static class Person {
        String name;
        int age;
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String toString() {
            return name + " (" + age + ")";
        }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25)
        );

        // Convert the list to a stream, sort the Person objects by age in ascending order using a lambda comparator,
        // then collect the sorted results back into a new List.
        List<Person> sorted = people.stream()
                .sorted((p1, p2) -> Integer.compare(p1.age, p2.age))
                .collect(Collectors.toList());

        // Print sorted list
        sorted.forEach(System.out::println);
    }
}

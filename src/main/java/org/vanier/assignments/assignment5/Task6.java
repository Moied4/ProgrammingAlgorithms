package org.vanier.assignments.assignment5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Task 6: Grouping Employees by Department and Count
 * Define an Employee class with String name and String department. Given a list of employees, use Stream API to create a Map that maps each department to the count of employees in it.
 *
 * Example Input:
 *
 * {name=Alice, department=HR}
 * {name=Bob, department=Finance}
 * {name=Charlie, department=HR}
 * Output:
 * {HR=2, Finance=1}
 */

public class Task6 {

    // Define Employee class with String name and String department
    static class Employee {
        String name;
        String department;

        Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        // Printing
        @Override
        public String toString() {
            return "{name=" + name + ", department=" + department + "}";
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "Finance"),
                new Employee("Charlie", "HR")
        );

        // Group employees by department and count them
        Map<String, Long> departmentCounts = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.department,       // Group by department
                        Collectors.counting()    // Count employees in each group
                ));

        // Print the resulting map
        System.out.println(departmentCounts);
    }
}

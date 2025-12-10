package org.vanier.labs.lab4;

/**
 * EmployeeTask1 class demonstrates encapsulation.
 * - Fields are private to prevent direct access.
 * - No setters are provided to ensure immutability after construction.
 * - Public getters allow controlled access.
 */
public class EmployeeTask1 {
    // Private fields: only accessible within this class
    private String name;
    private double salary;

    /**
     * Constructor to initialize EmployeeTask1 with a name and salary.
     * If the salary is non-positive, it defaults to 0.0 and a warning is printed.
     */
    public EmployeeTask1(String name, double salary) {
        this.name = name;
        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 0.0;
            System.out.println("Warning: Salary must be positive. Setting salary to 0.0");
        }
    }

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public getter for salary
    public double getSalary() {
        return salary;
    }

    // No setters provided to preserve data integrity and immutability
}
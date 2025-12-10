package org.vanier.labs.lab4;

/**
 *Task 1: Managing Employee Data (Encapsulation)
 *Goal: Design an Employee class that properly encapsulates its data, ensuring data integrity for sensitive information like salary.
 *Create an Employee class:
 *It should have the following private fields:
 *name (String)
 *salary (double)
 *Implement a constructor to initialize name and salary.
 *Crucially: The salary must be positive. If a non-positive value is passed during creation, set salary to 0.0 and print a warning message to the console.
 *Provide public getter methods for both name (getName()) and salary (getSalary()).
 *Important: Do not provide a setter method for any of salary or name to ensure it can only be set at object creation.
 *Demonstrate Encapsulation:
 *In your main method, create two Employee objects:
 *One with a valid name and positive salary.
 *One with a valid name and a non-positive salary (e.g., -500.0). Observe the warning message.
 *Try to directly access and modify the private salary field (e.g., employee.salary = 100000.0;) and observe the compile-time error.
 *Use the public getter methods (getName(), getSalary()) to retrieve and print the details of both Employee objects.
 */


public class Task1 {
    public static void main(String[] args) {
        // Create an employee with valid name and positive salary
        EmployeeTask1 emp1 = new EmployeeTask1("Bob", 70000);

        // Create an employee with valid name and invalid (negative) salary
        EmployeeTask1 emp2 = new EmployeeTask1("Joe", -500.0);  // Should trigger warning

        // Attempting to directly modify private field (uncommenting below causes compile-time error)
        // emp1.salary = 100000.0;  // Error: salary has private access in EmployeeTask1

        // Accessing employee data using public getters
        System.out.println("EmployeeTask1 1 -> Name: " + emp1.getName() + ", Salary: $" + emp1.getSalary());
        System.out.println("EmployeeTask1 2 -> Name: " + emp2.getName() + ", Salary: $" + emp2.getSalary());
    }
}


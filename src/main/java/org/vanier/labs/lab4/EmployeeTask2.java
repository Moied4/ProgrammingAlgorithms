package org.vanier.labs.lab4;


/**
 * Base class for all employees.
 * Demonstrates inheritance and method extensibility.
 */
public class EmployeeTask2 {
    protected String name;
    protected String employeeId;
    protected double baseSalary;

    public EmployeeTask2 (String name, String employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    public void getDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Base Salary: $" + baseSalary);
    }

    public double calculatePay() {
        return baseSalary;
    }
}


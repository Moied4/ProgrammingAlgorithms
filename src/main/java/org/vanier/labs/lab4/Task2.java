package org.vanier.labs.lab4;
/**
*Task 2: Employee Hierarchy (Inheritance) - No changes to this task from previous version.
*Goal: Design a simple employee hierarchy to demonstrate inheritance.
 *Create a Employee class:
 *Fields: name (String), employeeId (String), baseSalary (double).
 *Constructor to initialize these fields.
 *Public methods: getDetails() (prints name, ID, and base salary), calculatePay() (returns baseSalary).
 *Create a Manager class:
 *This class should inherit from Employee.
 *Additional field: bonus (double).
*Constructor: Initialize inherited fields using super() and its own bonus.
*Override the calculatePay() method: It should return baseSalary + bonus.
*Override the getDetails() method to also include the bonus amount.
*Create a SalesPerson class:
*This class should inherit from Employee.
*Additional field: salesCommissionRate (double, e.g., 0.05 for 5%).
*Additional field: totalSales (double).
*Constructor: Initialize inherited fields using super() and its own salesCommissionRate and totalSales.
*Override the calculatePay() method: It should return baseSalary + (totalSales * salesCommissionRate).
*Override the getDetails() method to also include totalSales and salesCommissionRate.
*Demonstrate Inheritance:
*In your main method, create instances of Employee, Manager, and SalesPerson.
*Call getDetails() and calculatePay() for each instance. Observe how the overridden methods in Manager and SalesPerson provide specialized behavior while still leveraging the base Employee structure.
*/

public class Task2 {
    public static void main(String[] args) {
        EmployeeTask2 emp = new EmployeeTask2("Ronaldo", "M001", 50000);
        Manager mgr = new Manager("Messi", "P001", 70000, 10000);
        SalesPerson sp = new SalesPerson("Cherki", "S001", 40000, 0.05, 100000);

        System.out.println("=== Employee ===");
        emp.getDetails();
        System.out.println("Total Pay: $" + emp.calculatePay());
        System.out.println();

        System.out.println("=== Manager ===");
        mgr.getDetails();
        System.out.println("Total Pay: $" + mgr.calculatePay());
        System.out.println();

        System.out.println("=== SalesPerson ===");
        sp.getDetails();
        System.out.println("Total Pay: $" + sp.calculatePay());
    }
}

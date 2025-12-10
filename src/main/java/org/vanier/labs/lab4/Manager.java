package org.vanier.labs.lab4;

/**
 * Manager class extends Employee.
 * Demonstrates inheritance and method overriding.
 */
public class Manager extends EmployeeTask2 {
    private double bonus;

    public Manager(String name, String employeeId, double baseSalary, double bonus) {
        super(name, employeeId, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculatePay() {
        return baseSalary + bonus;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Bonus: $" + bonus);
    }
}

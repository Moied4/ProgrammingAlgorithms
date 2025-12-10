package org.vanier.labs.lab4;


/**
 * SalesPerson class extends Employee.
 * Includes commission-based compensation.
 */
public class SalesPerson extends EmployeeTask2 {
    private double salesCommissionRate;
    private double totalSales;

    public SalesPerson(String name, String employeeId, double baseSalary, double salesCommissionRate, double totalSales) {
        super(name, employeeId, baseSalary);
        this.salesCommissionRate = salesCommissionRate;
        this.totalSales = totalSales;
    }

    @Override
    public double calculatePay() {
        return baseSalary + (salesCommissionRate * totalSales);
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Commission Rate: " + (salesCommissionRate * 100) + "%");
    }
}

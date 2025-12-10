package org.vanier.assignments.assignment6;

/**
 * Question 2: Open/Closed Principle (OCP)
 * Context: Payment types extension.
 *
 * Design an abstract base class Payment with method pay(amount).
 * Implement concrete subclasses: CreditCardPayment and DebitCardPayment.
 * Add a new payment type PaypalPayment without changing existing classes but by extension only.
 * Demonstrate polymorphic payment processing.
 */

// OCP_PaymentDemo

public class Task2 {

    // --- Abstract Base Class: Payment (Open for extension, Closed for modification) ---
    abstract static class Payment {
        public abstract void pay(double amount);
    }

    // --- Concrete Class: CreditCardPayment ---
    static class CreditCardPayment extends Payment {
        @Override
        public void pay(double amount) {
            System.out.printf("Paid $%.2f using Credit Card.\n", amount);
        }
    }

    // --- Concrete Class: DebitCardPayment ---
    static class DebitCardPayment extends Payment {
        @Override
        public void pay(double amount) {
            System.out.printf("Paid $%.2f using Debit Card.\n", amount);
        }
    }

    // --- New Concrete Class: PaypalPayment (Added without modifying existing code) ---
    static class PaypalPayment extends Payment {
        @Override
        public void pay(double amount) {
            System.out.printf("Paid $%.2f using PayPal.\n", amount);
        }
    }

    // --- Main method to demonstrate polymorphism and OCP ---
    public static void main(String[] args) {
        // Create an array of different payment methods
        Payment[] payments = new Payment[] {
                new CreditCardPayment(),
                new DebitCardPayment(),
                new PaypalPayment()  // added later, no changes to other classes
        };

        double amount = 100.0;

        System.out.println("=== Payment Processing ===");

        // Polymorphic payment processing
        for (Payment payment : payments) {
            payment.pay(amount);
        }

        System.out.println("==========================");
    }
}


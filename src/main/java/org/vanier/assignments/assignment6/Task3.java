package org.vanier.assignments.assignment6;

/**
 * Question 3: Liskov Substitution Principle (LSP)
 * Context: Payment method behavior.
 *
 * Base class PaymentMethod with pay(amount).
 * Subclass CreditCard overrides pay with credit-specific logic.
 * Subclass DebitCard that may throw exception if funds insufficient, ensure it fully satisfies PaymentMethod expectations (no surprises).
 * Design so all subclasses can be substituted without breaking client code.
 */

// LSP_PaymentDemo


public class Task3 {

    // --- Base class: PaymentMethod ---
    abstract static class PaymentMethod {
        public abstract void pay(double amount);
    }

    // --- Subclass: CreditCard ---
    static class CreditCard extends PaymentMethod {
        @Override
        public void pay(double amount) {
            System.out.printf("Paid $%.2f using Credit Card (processed on credit).\n", amount);
        }
    }

    // --- Subclass: DebitCard ---
    static class DebitCard extends PaymentMethod {
        private double balance;

        public DebitCard(double balance) {
            this.balance = balance;
        }

        @Override
        public void pay(double amount) {
            if (amount > balance) {
                // print an error and handle the insufficient funds scenario else display remaining balance
                System.out.printf("Payment of $%.2f failed: Insufficient funds (balance: $%.2f).\n", amount, balance);
            } else {
                balance -= amount;
                System.out.printf("Paid $%.2f using Debit Card. Remaining balance: $%.2f\n", amount, balance);
            }
        }
    }

    // --- Main method to demonstrate LSP-compliant behavior ---
    public static void main(String[] args) {
        // Array of base class references
        PaymentMethod[] methods = new PaymentMethod[] {
                new CreditCard(),
                new DebitCard(300.0)  // Initialize with balance
        };

        System.out.println("=== LSP-Compliant Payment Processing ===");
        for (PaymentMethod method : methods) {
            method.pay(250.0);
        }

        System.out.println("\n--- Trying to pay more than available with DebitCard ---");
        methods[1].pay(100.0);  // DebitCard now has $50, this should trigger and display insufficient funds
        System.out.println("==========================================");
    }
}


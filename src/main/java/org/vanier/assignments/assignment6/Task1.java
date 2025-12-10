package org.vanier.assignments.assignment6;

/**
 * Question 1: Single Responsibility Principle (SRP)
 * Context: Build a payment processing module.
 *
 * Create separate classes to handle payment authorization, payment processing, and receipt printing.
 * Each class should have one responsibility without overlapping.
 * Example: AuthorizationHandler authorizes cards, PaymentProcessor processes payment, ReceiptPrinter prints receipts.
 */

// SRP_PaymentProcessingDemo

public class Task1 {

    // --- Interface: AuthorizationService ---
    interface AuthorizationService {
        boolean authorize(String cardNumber, String cvv, String expiryDate);
    }

    // --- Implementation: CardAuthorizationHandler ---
    static class CardAuthorizationHandler implements AuthorizationService {
        @Override
        public boolean authorize(String cardNumber, String cvv, String expiryDate) {
            System.out.println("Authorizing card...");

            // --- Logic: String not null ---
            if (cardNumber != null && cvv != null && expiryDate != null) {
                System.out.println("Authorization successful.");
                return true;
            }

            System.out.println("Authorization failed.");
            return false;
        }
    }

    // --- Interface: PaymentService ---
    interface PaymentService {
        boolean processPayment(double amount);
    }

    // --- Implementation: SimplePaymentProcessor ---
    static class SimplePaymentProcessor implements PaymentService {
        @Override
        public boolean processPayment(double amount) {
            if (amount > 0) {
                System.out.printf("Processing payment of $%.2f...\n", amount);
                // Simulate processing
                System.out.println("Payment processed successfully.");
                return true;
            }

            System.out.println("Invalid amount. Payment failed.");
            return false;
        }
    }

    // --- Interface: ReceiptService ---
    interface ReceiptService {
        void printReceipt(double amount, boolean status);
    }

    // --- Implementation: ConsoleReceiptPrinter ---
    static class ConsoleReceiptPrinter implements ReceiptService {
        @Override
        public void printReceipt(double amount, boolean status) {
            System.out.println("\n----- RECEIPT -----");
            System.out.printf("Amount: $%.2f\n", amount);
            System.out.println("Status: " + (status ? "Success" : "Failed"));
            System.out.println("-------------------\n");
        }
    }

    // --- Main method to demonstrate SRP ---
    public static void main(String[] args) {
        // Sample data
        String cardNumber = "1974-8778-9566-3552";
        String cvv = "123";
        String expiryDate = "12/29";
        double amount = 188.90;

        // Create service objects
        AuthorizationService authService = new CardAuthorizationHandler();
        PaymentService paymentService = new SimplePaymentProcessor();
        ReceiptService receiptService = new ConsoleReceiptPrinter();

        // Execute payment workflow
        if (authService.authorize(cardNumber, cvv, expiryDate)) {
            boolean paymentStatus = paymentService.processPayment(amount);
            receiptService.printReceipt(amount, paymentStatus);
        } else {
            System.out.println("Transaction aborted due to failed authorization.");
        }
    }
}

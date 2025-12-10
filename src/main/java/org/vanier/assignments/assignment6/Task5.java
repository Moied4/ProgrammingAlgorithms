/**
 * Question 5: Dependency Inversion Principle (DIP)
 * Context: Payment gateway integration.
 *
 * Define a PaymentGateway interface with processPayment(amount).
 * Implement StripeGateway and PaypalGateway.
 * PaymentProcessor depends on PaymentGateway interface, not on concrete gateway classes.
 * Demonstrate how to use different gateways without changing PaymentProcessor.
 */

//DIP_PaymentDemo

package org.vanier.assignments.assignment6;

// --- PaymentGateway interface (abstraction) ---
interface PaymentGateway {
    boolean processPayment(double amount);
}

// --- StripeGateway implementation ---
class StripeGateway implements PaymentGateway {
    @Override
    public boolean processPayment(double amount) {
        System.out.printf("Processing payment of $%.2f via Stripe...\n", amount);
        // Simulate success
        System.out.println("Stripe: Payment successful.");
        return true;
    }
}

// --- PaypalGateway implementation ---
class PaypalGateway implements PaymentGateway {
    @Override
    public boolean processPayment(double amount) {
        System.out.printf("Processing payment of $%.2f via PayPal...\n", amount);
        // Simulate success
        System.out.println("PayPal: Payment successful.");
        return true;
    }
}

// --- PaymentProcessor depends on abstraction (PaymentGateway) ---
class PaymentProcessor {
    private PaymentGateway paymentGateway;

    // Dependency Injection via constructor
    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void executePayment(double amount) {
        System.out.println("Starting payment processing...");
        boolean success = paymentGateway.processPayment(amount);
        if (success) {
            System.out.println("Payment processed successfully.\n");
        } else {
            System.out.println("Payment failed.\n");
        }
    }
}

// --- Main class to demonstrate DIP ---
public class Task5 {
    public static void main(String[] args) {
        double amount = 120.50;

        // Using Stripe gateway
        PaymentGateway stripe = new StripeGateway();
        PaymentProcessor processor1 = new PaymentProcessor(stripe);
        System.out.println("Using Stripe Gateway:");
        processor1.executePayment(amount);

        // Using Paypal gateway
        PaymentGateway paypal = new PaypalGateway();
        PaymentProcessor processor2 = new PaymentProcessor(paypal);
        System.out.println("Using PayPal Gateway:");
        processor2.executePayment(amount);
    }
}

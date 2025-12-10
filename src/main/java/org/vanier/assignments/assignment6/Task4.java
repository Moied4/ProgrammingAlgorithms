package org.vanier.assignments.assignment6;

/**
 * Question 4: Interface Segregation Principle (ISP)
 * Context: Card functionalities.
 *
 * Separate interfaces:
 * ICard with getCardDetails() and validate().
 * IRechargeable with recharge(amount) (e.g., for prepaid debit cards).
 * ICredit with increaseCreditLimit(amount) (only for credit cards).
 * Implement DebitCard and CreditCard classes implementing only the interfaces relevant to them.
 */

// ISP_CardDemo



//  Interface: ICard
interface ICard {
    String getCardDetails();
    boolean validate();
}

//  Interface: IRechargeable
interface IRechargeable {
    void recharge(double amount);
}

//  Interface: ICredit
interface ICredit {
    void increaseCreditLimit(double amount);
}

//  Class: DebitCard
class DebitCard implements ICard, IRechargeable {
    private String cardNumber;
    private double balance;

    public DebitCard(String cardNumber, double initialBalance) {
        this.cardNumber = cardNumber;
        this.balance = initialBalance;
    }

    @Override
    public String getCardDetails() {
        return "Debit Card: " + cardNumber + ", Balance: $" + balance;
    }

    @Override
    public boolean validate() {
        System.out.println("Validating Debit Card...");
        return cardNumber != null && cardNumber.length() == 16;
    }

    @Override
    public void recharge(double amount) {
        balance += amount;
        System.out.printf("Recharged $%.2f. New Balance: $%.2f\n", amount, balance);
    }
}

//  Class: CreditCard
class CreditCard implements ICard, ICredit {
    private String cardNumber;
    private double creditLimit;

    public CreditCard(String cardNumber, double creditLimit) {
        this.cardNumber = cardNumber;
        this.creditLimit = creditLimit;
    }

    @Override
    public String getCardDetails() {
        return "Credit Card: " + cardNumber + ", Credit Limit: $" + creditLimit;
    }

    @Override
    public boolean validate() {
        System.out.println("Validating Credit Card...");
        return cardNumber != null && cardNumber.length() == 16;
    }

    @Override
    public void increaseCreditLimit(double amount) {
        creditLimit += amount;
        System.out.printf("Increased credit limit by $%.2f. New Limit: $%.2f\n", amount, creditLimit);
    }
}

// === Main class to demonstrate ISP ===
public class Task4 {
    public static void main(String[] args) {
        // Updated card numbers and values
        ICard debit = new DebitCard("4444555566667777", 250.0);
        ICard credit = new CreditCard("9999000011112222", 4000.0);

        System.out.println("=== Debit Card Operations ===");
        System.out.println(debit.getCardDetails());
        System.out.println("Valid: " + debit.validate());
        if (debit instanceof IRechargeable) {
            ((IRechargeable) debit).recharge(100.0);
        }

        System.out.println("\n=== Credit Card Operations ===");
        System.out.println(credit.getCardDetails());
        System.out.println("Valid: " + credit.validate());
        if (credit instanceof ICredit) {
            ((ICredit) credit).increaseCreditLimit(750.0);
        }
    }
}


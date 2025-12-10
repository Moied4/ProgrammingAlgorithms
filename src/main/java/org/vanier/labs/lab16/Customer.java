//package org.vanier.labs.lab16;
//
////Moied Ahmed 1090065 lab16 Programming Algorithms and Patterns
//
////Task1 - Single Responsibility Principle (SRP)
////Sending email or sms or both to customers depending on customers preference.
////Customer must have id, name, phoneNumber, preference.
//
//// Customer.java and the SRP
//// This class adheres to the Single Responsibility Principle by only managing customer data (id, name, phone number, and preference).
//// It does not handle any notification logic, which is delegated to separate service classes.
//
//// Customer.java
//public class Customer {
//    private int id;
//    private String name;
//    private String phoneNumber;
//    private String preference; // "email", "sms", or "both"
//
//    public Customer(int id, String name, String phoneNumber, String preference) {
//        this.id = id;
//        this.name = name;
//        this.phoneNumber = phoneNumber;
//        this.preference = preference.toLowerCase();
//    }
//
//    // Getters
//    public int getId() { return id; }
//    public String getName() { return name; }
//    public String getPhoneNumber() { return phoneNumber; }
//    public String getPreference() { return preference; }
//}
//
//// EmailService.java
//public class EmailService {
//    public void sendEmail(Customer customer) {
//        System.out.println("Sending EMAIL to " + customer.getName() +
//                " [ID: " + customer.getId() + "] at email@example.com");
//    }
//}
//
//// SMSService.java
//public class SMSService {
//    public void sendSMS(Customer customer) {
//        System.out.println("Sending SMS to " + customer.getName() +
//                " [ID: " + customer.getId() + "] at " + customer.getPhoneNumber());
//    }
//}
//
//// NotificationService.java
//public class NotificationService {
//    private EmailService emailService = new EmailService();
//    private SMSService smsService = new SMSService();
//
//    public void notifyCustomer(Customer customer) {
//        switch (customer.getPreference()) {
//            case "email":
//                emailService.sendEmail(customer);
//                break;
//            case "sms":
//                smsService.sendSMS(customer);
//                break;
//            case "both":
//                emailService.sendEmail(customer);
//                smsService.sendSMS(customer);
//                break;
//            default:
//                System.out.println("Invalid notification preference for " + customer.getName());
//        }
//    }
//}
//
//// Main.java
//public class Main {
//    public static void main(String[] args) {
//        Customer mac = new Customer(1023, "Mac", "645-761-9822", "email");
//        Customer sam = new Customer(4567, "Sam", "467-889-9923", "sms");
//        Customer jessie = new Customer(7891, "Jessie", "678-901-0987", "both");
//
//        NotificationService notifier = new NotificationService();
//
//        notifier.notifyCustomer(mac);
//        notifier.notifyCustomer(sam);
//        notifier.notifyCustomer(jessie);
//    }
//}

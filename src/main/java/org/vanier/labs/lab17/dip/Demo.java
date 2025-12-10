package org.vanier.labs.lab17.dip;

/**
 * Task5 - Dependency Inversion Principle (DIP) :
 * Refactor a notification system so the sender class depends on a Notifier interface. Write two implementations: EmailNotifier and SMSNotifier.
 */

public class Demo {
    public static void main(String[] args) {
       Notifier email=new EmailNotifier();
       Notifier sms=new SmsNotifier();
       Sender emailSender=new Sender(email);
       Sender smsSender=new Sender(sms);

       emailSender.notifyUser("Your amazon package is on the way, I am not scammer");
       smsSender.notifyUser("Your code is 7934, expires in 1 minute");
    }
}

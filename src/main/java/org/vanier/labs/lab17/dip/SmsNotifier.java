package org.vanier.labs.lab17.dip;

public class SmsNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println(" SMS :" + message);
    }
}

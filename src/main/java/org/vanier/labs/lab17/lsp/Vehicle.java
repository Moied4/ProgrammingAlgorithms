package org.vanier.labs.lab17.lsp;

import lombok.AllArgsConstructor;
import org.vanier.labs.lab17.dip.Notifier;
@AllArgsConstructor
public class Vehicle {
    String make;
    String model;
    Integer year;

    public void start() {
        System.out.println("Vehicle started");
    }
}

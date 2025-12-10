package org.vanier.labs.lab17.lsp;

public class GasCar extends Vehicle implements Refuelable {

    public GasCar(String make, String model, Integer year) {
        super(make, model, year);
    }

    @Override
    public void start() {
        System.out.println("Gas car engine start");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling my gas car");
    }
}


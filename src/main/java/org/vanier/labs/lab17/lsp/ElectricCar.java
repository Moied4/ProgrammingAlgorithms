package org.vanier.labs.lab17.lsp;

public class ElectricCar extends Vehicle implements Rechargeable {

    public ElectricCar(String make, String model, Integer year) {
        super(make, model, year);
    }

    @Override
    public void start() {
        System.out.println("Electric car starting");
    }

    @Override
    public void recharge() {
        System.out.println("Charging electric car");
    }
}

package org.vanier.labs.lab4;

/**
 * Abstract base class for all vehicles.
 */
public abstract class AbstractVehicle {
    protected String make;
    protected String model;

    public AbstractVehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void getDetails() {
        System.out.println("Vehicle: " + make + " " + model);
    }

    public abstract void start();
    public abstract void stop();
}


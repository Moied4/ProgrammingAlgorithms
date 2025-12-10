package org.vanier.labs.lab4;

/**
 * Gas-powered car implementation.
 */
public class GasCar extends AbstractVehicle implements IEnergizing {

    public GasCar(String make, String model) {
        super(make, model);
    }

    @Override
    public void start() {
        System.out.println("Gas Car engine starts.");
    }

    @Override
    public void stop() {
        System.out.println("Gas Car engine stops.");
    }

    @Override
    public void getEnergy() {
        System.out.println("Filling gas tank with premium gasoline.");
    }
}


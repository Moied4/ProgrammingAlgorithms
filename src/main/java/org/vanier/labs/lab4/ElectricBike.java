package org.vanier.labs.lab4;

    /**
     * Electric bike implementation.
     */
    public class ElectricBike extends AbstractVehicle implements IEnergizing {

        public ElectricBike(String make, String model) {
            super(make, model);
        }

        @Override
        public void start() {
            System.out.println("Electric Bike motor turns on.");
        }

        @Override
        public void stop() {
            System.out.println("Electric Bike motor powers down.");
        }

        @Override
        public void getEnergy() {
            System.out.println("Charging battery at a charging station.");
        }
    }



package org.vanier.labs.lab4;

import java.util.ArrayList;

/**Task 6: Vehicle Energy Management (Advanced Abstraction & Interfaces)
* Goal: Explore abstraction and interfaces for managing vehicle operations and energy.
 *Create an abstract class AbstractVehicle:
 *Protected fields: make (String), model (String).
 *Constructor: Initialize make and model.
 *Public concrete method: getDetails() (prints make and model).
 *Abstract methods:
 *abstract void start();
 *abstract void stop();
 *Create an IEnergizing Interface:
 *Define one abstract method: void getEnergy(); (This method represents the action of getting fuel/charge).
 *Create Concrete Vehicle Classes:
 *GasCar class:
 *Extends AbstractVehicle and implements IEnergizing.
 *Constructor: Initialize inherited fields.
 *Implement start(): Print "Gas Car engine starts."
 *Implement stop(): Print "Gas Car engine stops."
 *Implement getEnergy(): Print "Filling gas tank with gasoline."
 *ElectricBike class:
 *Extends AbstractVehicle and implements IEnergizing.
 *Constructor: Initialize inherited fields.
 *Implement start(): Print "Electric Bike motor whirs to life."
 *Implement stop(): Print "Electric Bike motor powers down."
 *Implement getEnergy(): Print "Charging battery at a charging station."
 *Demonstrate Abstraction and Polymorphism:
 *In your main method, create an ArrayList of AbstractVehicle objects and an ArrayList of IEnergizing objects.
 *Add instances of GasCar and ElectricBike to both lists where appropriate.
 *Loop 1 (Vehicles): Iterate through the AbstractVehicle list. For each vehicle, call getDetails(), start(), and stop().
 *Loop 2 (Energizing): Iterate through the IEnergizing list. For each item, call getEnergy().
 *Discuss: How does this design allow you to treat GasCar and ElectricBike uniformly for starting/stopping (via AbstractVehicle) and for getting energy (via IEnergizing), even though their underlying implementations are different?
*/

public class Task6Demo {
    public static void main(String[] args) {
        // AbstractVehicle list for start/stop operations
        ArrayList<AbstractVehicle> vehicles = new ArrayList<>();

        // IEnergizing list for energy operations
        ArrayList<IEnergizing> energySources = new ArrayList<>();

        // Create vehicles
        GasCar car = new GasCar("Toyota", "Camry");
        ElectricBike bike = new ElectricBike("Suzuki", "GSX-R");

        // Add to respective lists
        vehicles.add(car);
        vehicles.add(bike);

        energySources.add(car);
        energySources.add(bike);

        // Loop 1 – using AbstractVehicle reference
        System.out.println("=== Vehicle Start/Stop Operations ===");
        for (AbstractVehicle v : vehicles) {
            v.getDetails();
            v.start();
            v.stop();
            System.out.println();
        }

        // Loop 2 – using IEnergizing reference
        System.out.println("=== Energy Operations ===");
        for (IEnergizing e : energySources) {
            e.getEnergy();
        }
    }
}

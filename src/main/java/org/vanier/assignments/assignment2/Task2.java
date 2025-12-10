package org.vanier.assignments.assignment2;

// Task2.java

/**
 * Task 2: Basic Vehicle Hierarchy (OOP - Inheritance)
 *
 * Goal: Create a simple inheritance structure.
 *
 * Create a Vehicle class:
 * - Field: brand (String).
 * - Constructor.
 * - Method: startEngine() (prints "Engine started.").
 *
 * Create a Car class:
 * - Extends Vehicle.
 * - Additional field: model (String).
 * - Constructor: Initialize brand (using super()) and model.
 * - Override startEngine(): Print "Car engine started with a turn of the key."
 *
 * Demonstrate: In a main method, create instances of both Vehicle and Car.
 * Call startEngine() on both and observe the output.
 *
 * -----------------------------------------------
 * Explanation:
 * - OOP Concept Used: Inheritance and Polymorphism
 *   - Inheritance is used to let Car reuse functionality from Vehicle.
 *   - The Car class extends Vehicle and adds its own properties and behavior.
 *   - Polymorphism is shown through method overriding — Car provides its own version of startEngine().
 *
 *
 */

public class Task2 {

    // Main method to demonstrate inheritance and method overriding
    public static void main(String[] args) {
        // Create a Vehicle object
        Vehicle vehicle = new Vehicle("MoiedMotorsINC");
        vehicle.startEngine(); // Expected output: "Engine started."

        // Create a Car object
        Car car = new Car("Toyota", "Corolla");
        car.startEngine(); // Expected output: "Car engine started with a turn of the key."
    }
}

/**
 * Vehicle class representing a general vehicle
 */
class Vehicle {
    // Protected field allows access in subclass
    protected String brand;

    /**
     * Constructor to initialize the brand
     */
    public Vehicle(String brand) {
        this.brand = brand;
    }

    /**
     * Method to start the engine
     */
    public void startEngine() {
        System.out.println("Engine started.");
    }
}

/**
 * Car class that extends Vehicle
 */
class Car extends Vehicle {
    private String model;

    /**
     * Constructor for Car, calls super() to set brand
     */
    public Car(String brand, String model) {
        super(brand); // Call Vehicle constructor
        this.model = model;
    }

    /**
     * Overridden method to start the engine with Car-specific message
     */
    @Override
    public void startEngine() {
        System.out.println("Car engine started with a turn of the key.");
    }
}

package org.vanier.labs.lab4;

/**
 * Task 3: Geometric Calculations (Polymorphism - Overriding & Interfaces)
 * Goal: Implement polymorphism using separate interfaces for area and perimeter, applied to different geometric shapes.
 * Create Two Interfaces:
 * IShapeArea Interface:
 * Define one abstract method: double calculateArea().
 * IShapePerimeter Interface:
 * Define one abstract method: double calculatePerimeter().
 * Create Concrete Shape Classes:
 * Ellipse class:
 * Implements both IShapeArea and IShapePerimeter.
 * Private fields: majorAxis (double), minorAxis (double).
 * Constructor to initialize these fields.
 * Implement calculateArea() (π * majorAxis * minorAxis) and calculatePerimeter() (approx. π * (1.5 * (majorAxis + minorAxis) - sqrt(majorAxis * minorAxis))).
 * For simplicity, you can use a simpler approximation for perimeter like π * (majorAxis + minorAxis).
 * Parallelogram class:
 * Implements both IShapeArea and IShapePerimeter.
 * Private fields: base (double), height (double), side (double).
 * Constructor to initialize these fields.
 * Implement calculateArea() (base * height) and calculatePerimeter() (2 * (base + side)).
 * Demonstrate Runtime Polymorphism:
 * In your main method, create an ArrayList of IShapeArea objects and another ArrayList of IShapePerimeter objects.
 * Add instances of Ellipse and Parallelogram to both lists (as they implement both interfaces).
 * Loop 1: Iterate through the IShapeArea list. For each object, call calculateArea() and print the result.
 * Loop 2: Iterate through the IShapePerimeter list. For each object, call calculatePerimeter() and print the result.
 * Explain: How does this setup demonstrate runtime polymorphism, allowing you to treat different shapes uniformly based on the interfaces they implement?
 */

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        // Create shape objects
        IShapeEllipse ellipse = new IShapeEllipse(5.0, 3.0);
        Parallelogram parallelogram = new Parallelogram(6.0, 4.0, 5.0);

        // ArrayLists for area and perimeter interfaces
        ArrayList<IShapeArea> areaShapes = new ArrayList<>();
        ArrayList<IShapePerimeter> perimeterShapes = new ArrayList<>();

        // Add objects to both lists
        areaShapes.add(ellipse);
        areaShapes.add(parallelogram);

        perimeterShapes.add(ellipse);
        perimeterShapes.add(parallelogram);

        // Loop 1: Calculate and print areas
        System.out.println("== Shape Areas ==");
        for (IShapeArea shape : areaShapes) {
            System.out.printf("Area: %.2f\n", shape.calculateArea());
        }

        // Loop 2: Calculate and print perimeters
        System.out.println("\n== Shape Perimeters ==");
        for (IShapePerimeter shape : perimeterShapes) {
            System.out.printf("Perimeter: %.2f\n", shape.calculatePerimeter());
        }
    }
}


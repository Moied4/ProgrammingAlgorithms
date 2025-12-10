package org.vanier.labs.lab16;

//Task2 - Open/Closed Principle (OCP) : Area Calculation
//You should be able to add new functionality (e.g., new shapes) by extending the code without altering existing code.
//Calculate the area of a circle and a rectangle, using an abstract base class and extension through inheritance.

// Shape.java
abstract class Shape {
    public abstract double calculateArea();
}

// Circle.java
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle.java
class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }
}

// RightTriangle.java
class RightTriangle extends Shape {
    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    /* Theoretical Explanation:
     * Open/Closed Principle Demonstration:
     * RightTriangle EXTENDS the Shape base class,
     * without modifying existing classes like Circle, Rectangle, or AreaCalculator.
     * This demonstrates that the system is open for extension but closed for modification.
     */
}

// AreaCalculator.java
class AreaCalculator {
    public void printArea(Shape shape) {
        System.out.println("Area: " + shape.calculateArea());
    }
}

// Main.java
public class Task2 {
    public static void main(String[] args) {
        Shape circle = new Circle(7.3);
        Shape rectangle = new Rectangle(5.5, 8.2);
        Shape rightTriangle = new RightTriangle(4.1, 6.7);

        AreaCalculator calculator = new AreaCalculator();

        calculator.printArea(circle);
        calculator.printArea(rectangle);
        calculator.printArea(rightTriangle);
    }
}


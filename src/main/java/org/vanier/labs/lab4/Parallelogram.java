package org.vanier.labs.lab4;


// Parallelogram implements both area and perimeter calculation interfaces
public class Parallelogram implements IShapeArea, IShapePerimeter {
    private double base;
    private double height;
    private double side;

    public Parallelogram(double base, double height, double side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return base * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (base + side);
    }
}


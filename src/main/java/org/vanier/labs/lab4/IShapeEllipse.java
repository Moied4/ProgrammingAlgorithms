package org.vanier.labs.lab4;


// Ellipse implements both area and perimeter calculation interfaces
public class IShapeEllipse implements IShapeArea, IShapePerimeter {
    private double majorAxis;
    private double minorAxis;

    public IShapeEllipse(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public double calculateArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public double calculatePerimeter() {
        // Simplified approximation: π * (majorAxis + minorAxis)
        return Math.PI * (majorAxis + minorAxis);
    }
}

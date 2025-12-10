package org.vanier.labs.lab17.isp.bad;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Line implements Shape{
    double length;

    @Override
    public double perimeter() {
        return length;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}

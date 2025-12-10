package org.vanier.labs.lab17.isp.bad;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Ball implements Shape{
    double radius;
    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return 4 * Math.PI * radius * radius * radius /3;
    }
}

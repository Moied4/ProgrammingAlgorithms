package org.vanier.labs.lab17.isp.bad;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Disk implements Shape{
    double radius;

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return 0;
    }
}


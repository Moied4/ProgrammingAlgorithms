package org.vanier.labs.lab17.isp.good;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Disk implements HasPerimeter, HasArea{
    double radius;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

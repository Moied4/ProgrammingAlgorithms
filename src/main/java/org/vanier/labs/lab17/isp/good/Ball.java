package org.vanier.labs.lab17.isp.good;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Ball implements HasArea, HasVolume {
    double radius;
    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return 4 * Math.PI * radius * radius * radius /3;
    }
}

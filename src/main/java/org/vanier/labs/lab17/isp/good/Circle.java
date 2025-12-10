package org.vanier.labs.lab17.isp.good;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle implements HasPerimeter {
    double radius;
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

}

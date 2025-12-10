package org.vanier.labs.lab17.isp.good;


/**Task4 - Interface Segregation Principle (ISP) : Perimeter, Area, Volume
 /**You are designing a geometric shapes library. Not every shape supports all of perimeter, area and volume calculations (e.g., a line only has length, not area or perimeter, circle has perimeter, area, but not volume, ball has no perimeter, but has surface area and volume ). Apply ISP so that no shape is forced to implement methods that do not make sense for it.
 */


public class GoodDemo {
    public static void main(String[] args) {

        org.vanier.labs.lab17.isp.good.Disk disk = new Disk(10);
        System.out.println("disk.area() = " + disk.area());
        System.out.println("disk.perimeter() = " + disk.perimeter());

        Circle circle = new Circle(10);
        System.out.println("circle.perimeter() = " + circle.perimeter());

        org.vanier.labs.lab17.isp.good.Ball ball = new Ball(10);
        System.out.println("ball.area() = " + ball.area());
        System.out.println("ball.volume() = " + ball.volume());
    }
}

package org.vanier.labs.lab17.isp.bad;

public class Demo {
    public static void main(String[] args) {
        Line line = new Line(7);
        System.out.println("line.perimeter() = " + line.perimeter());

        Disk disk = new Disk(10);
        System.out.println("disk.area() = " + disk.area());
        System.out.println("disk.perimeter() = " + disk.perimeter());

        Ball ball = new Ball(10);
        System.out.println("ball.area() = " + ball.area());
        System.out.println("ball.volume() = " + ball.volume());
    }
}

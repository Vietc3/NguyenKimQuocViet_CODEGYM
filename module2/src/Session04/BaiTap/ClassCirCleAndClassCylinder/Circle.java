package Session04.BaiTap.ClassCirCleAndClassCylinder;

import java.util.Scanner;

public class Circle {
    private double radius;
    private String color;

    public Circle(String Color, double radius) {
        this.radius = radius;
        this.color = Color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return this.radius * this.radius * 3.14;
    }

    @Override
    public String toString() {
        return "Im Circle, My Color is " + getColor() + " and My Radius is: " + getRadius();
    }

}




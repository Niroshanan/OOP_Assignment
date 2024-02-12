package org.example.shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius,double thickness) {

        super(thickness);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculateAreaWithBorders() {
        return Math.PI * (radius+thickness) * (radius+thickness);
    }
}

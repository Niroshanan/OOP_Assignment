package org.example.shapes;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width,double thickness) {
        super(thickness);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculateAreaWithBorders() {
        double lengthWithBorder = length+(2*thickness);
        double widthWithBorder = width + (2*thickness);
        return lengthWithBorder*widthWithBorder;
    }
}

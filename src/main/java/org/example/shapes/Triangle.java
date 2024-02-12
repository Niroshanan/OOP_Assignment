package org.example.shapes;

public class Triangle extends Shape {
    private double length1;
    private double length2;
    private double length3;

    public Triangle(double length1, double length2, double length3, double thickness) {
        super(thickness);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    @Override
    public double calculateArea() {
        double s = (length1 + length2 + length3) / 2;
        return Math.sqrt(s * (s - length1) * (s - length2) * (s - length3));
    }

    @Override
    public double calculateAreaWithBorders() {
        return calculateArea() + (length1 + length2 + length3) * thickness;
    }
}

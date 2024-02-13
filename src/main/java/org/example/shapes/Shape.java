package org.example.shapes;

public abstract class Shape {
    protected double thickness;

    public Shape(double thickness) {
        this.thickness = thickness;
    }

    public abstract double calculateArea();
    public abstract double calculateAreaWithBorders();
    public double calculateAreaWithoutBorders() {
        return calculateAreaWithBorders()-calculateArea();
    }
}

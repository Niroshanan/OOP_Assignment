package org.example.shapes;

public abstract class Shape {
    double thickness;

    public Shape(double thickness) {
        this.thickness = thickness;
    }

    public abstract double calculateArea();
    public abstract double calculateAreaWithBorders();
}

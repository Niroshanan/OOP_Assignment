package org.example.shapes;

public class Square extends Shape {
    private double sideLength;

    public Square(double len,double thickness) {
        super(thickness);
        this.sideLength = len;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    public double calculateAreaWithBorders() {
        double sideLengthWithBorder = sideLength+(2*thickness);
        return sideLengthWithBorder*sideLengthWithBorder;
    }
}

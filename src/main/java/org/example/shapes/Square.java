package org.example.shapes;

public class Square implements Shape {
    private double sideLength;

    public Square(double len) {
        this.sideLength = len;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }
}

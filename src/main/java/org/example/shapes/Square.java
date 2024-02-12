package org.example.shapes;

public class Square implements Shape {
    double sideLength;
    public Square(double len){
        this.sideLength = len;
    }
    @Override
    public double totalArea() {
        return sideLength * sideLength;
    }
}

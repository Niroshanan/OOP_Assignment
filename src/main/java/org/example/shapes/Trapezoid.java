package org.example.shapes;

public class Trapezoid extends Shape {
    private double base1;
    private double base2;
    private double height;

    public Trapezoid(double base1, double base2, double height,double thickness) {
        super(thickness);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((base1+base2)*height)/2;
    }

    @Override
    public double calculateAreaWithBorders() {
        double heightWithBorder = height+(2*thickness);
        double Base1WithBorder = base1+(2*thickness);
        double Base2WithBorder = base2+(2*thickness);
        return ((Base1WithBorder+Base2WithBorder)*heightWithBorder)/2;
    }
}

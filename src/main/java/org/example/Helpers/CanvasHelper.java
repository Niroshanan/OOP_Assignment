package org.example.Helpers;

import org.example.canvas.Canvas;
import org.example.shapes.*;

import java.util.Scanner;

public class CanvasHelper {
    static Canvas canvas = new Canvas();
    Scanner canvasScanner = new Scanner(System.in);

    public void addNewElement() {
        System.out.println("\nSelect the Element to add to canvas");
        System.out.println("1- Square\n2- Rectangle\n3- Circle \n4- triangle\n5- trapezoid \n9- main menu");
        System.out.print("Enter Input: ");
        String inputString = canvasScanner.nextLine();

        int elementInput = 0;
        try {
            elementInput = Integer.parseInt(inputString);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
            addNewElement();
        }
        switch (elementInput) {
            case 1 -> {
                System.out.print("Enter Length of a side of Square:");
                double len = takeUserInput();
                if (len > 0) {
                    Square square = new Square(len);
                    canvas.addElement(square);
                } else {
                    System.out.println("Element Not Added");
                }
            }
            case 2 -> {
                System.out.print("Enter Length of rectangle:");
                double length = takeUserInput();
                System.out.print("Enter Width of rectangle: ");
                double width = takeUserInput();
                if (length > 0 && width > 0) {
                    Rectangle rectangle = new Rectangle(length, width);
                    canvas.addElement(rectangle);
                } else {
                    System.out.println("Element Not Added");
                }
            }
            case 3 -> {
                System.out.print("Enter Radius of circle:");
                double radius = takeUserInput();
                if (radius > 0) {
                    Circle circle = new Circle(radius);
                    canvas.addElement(circle);
                } else {
                    System.out.println("Element Not Added");
                }
            }
            case 4 -> {
                System.out.print("Enter Length of side 1 of triangle: ");
                double side1 = takeUserInput();
                System.out.print("Enter Length of side 2 of triangle: ");
                double side2 = takeUserInput();
                System.out.print("Enter Length of side 3 of triangle: ");
                double side3 = takeUserInput();
                if (side1 > 0 && side2 > 0 && side3 > 0) {
                    Triangle triangle = new Triangle(side1, side2, side3);
                    canvas.addElement(triangle);
                } else {
                    System.out.println("Element Not Added");
                }
            }
            case 5 -> {
                System.out.print("Enter Length of top parallel line of trapezoid: ");
                double length1 = takeUserInput();
                System.out.print("Enter Length of bottom parallel line of trapezoid: ");
                double length2 = takeUserInput();
                System.out.print("Enter Height of trapezoid: ");
                double height = takeUserInput();
                if (length1 > 0 && length2 > 0 && height > 0) {
                    Trapezoid trapezoid = new Trapezoid(length1,length2,height);
                    canvas.addElement(trapezoid);
                } else {
                    System.out.println("Element Not Added");
                }
            }
            case 9 -> {
            }
            default -> {
                System.out.println("Incorrect Input");
                addNewElement();
            }
        }
    }

    public void calculateTotalArea() {
        System.out.println("Total Area of the Canvas is: " + canvas.totalArea());
    }

    private double takeUserInput() {
        double value = 0;
        String valueString;
        try {
            valueString = canvasScanner.nextLine();
            value = Double.parseDouble(valueString);
        } catch (Exception e) {
            System.out.println("Invalid value");
        }
        return value;
    }
}

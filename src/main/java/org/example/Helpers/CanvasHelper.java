package org.example.Helpers;

import org.example.canvas.Canvas;
import org.example.shapes.*;

import java.util.Scanner;

public class CanvasHelper {
    Canvas canvas = new Canvas();
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
            System.out.println("Invalid Input");
            addNewElement();
        }
        switch (elementInput) {
            case 1 -> addSquare();
            case 2 -> addRectangle();
            case 3 -> addCircle();
            case 4 -> addTriangle();
            case 5 -> addTrapezoid();
            case 9 -> {
            }
            default -> {
                System.out.println("Incorrect Input");
                addNewElement();
            }
        }
    }

    private void addSquare() {
        double thickness = takeUserInput("Enter Thickness of Border");
        double len = takeUserInput("Enter Length of a side of Square:");
        if (len > 0) {
            Square square = new Square(len, thickness);
            canvas.addElement(square);
            System.out.println("Element Added");
        } else {
            System.out.println("Element Not Added");
        }
    }

    private void addRectangle() {
        double thickness = takeUserInput("Enter Thickness of Border");
        double length = takeUserInput("Enter Length of rectangle:");
        double width = takeUserInput("Enter Width of rectangle: ");
        if (length > 0 && width > 0) {
            Rectangle rectangle = new Rectangle(length, width, thickness);
            canvas.addElement(rectangle);
            System.out.println("Element Added");
        } else {
            System.out.println("Element Not Added");
        }
    }

    private void addCircle() {
        double thickness = takeUserInput("Enter Thickness of Border");
        double radius = takeUserInput("Enter Radius of circle:");
        if (radius > 0) {
            Circle circle = new Circle(radius, thickness);
            canvas.addElement(circle);
            System.out.println("Element Added");
        } else {
            System.out.println("Element Not Added");
        }
    }

    private void addTriangle() {
        double thickness = takeUserInput("Enter Thickness of Border");
        double side1 = takeUserInput("Enter Length of side 1 of triangle: ");
        double side2 = takeUserInput("Enter Length of side 2 of triangle: ");
        double side3 = takeUserInput("Enter Length of side 3 of triangle: ");
        if (side1 > 0 && side2 > 0 && side3 > 0) {
            Triangle triangle = new Triangle(side1, side2, side3, thickness);
            canvas.addElement(triangle);
            System.out.println("Element Added");
        } else {
            System.out.println("Element Not Added");
        }
    }

    private void addTrapezoid() {
        double thickness = takeUserInput("Enter Thickness of Border");
        double length1 = takeUserInput("Enter Length of top parallel line of trapezoid: ");
        double length2 = takeUserInput("Enter Length of bottom parallel line of trapezoid: ");
        double height = takeUserInput("Enter Height of trapezoid: ");
        if (length1 > 0 && length2 > 0 && height > 0) {
            Trapezoid trapezoid = new Trapezoid(length1, length2, height, thickness);
            canvas.addElement(trapezoid);
            System.out.println("Element Added");
        } else {
            System.out.println("Element Not Added");
        }
    }

    public void calculateTotalAreaOfBorder() {
        double totalAreaOfBorder = canvas.totalAreaWithBorder() - canvas.totalArea();
        System.out.println("Total Area of Border is: " + totalAreaOfBorder);
    }

    public void calculateTotalAreaWithoutBorder() {
        System.out.println("Total Area of the Canvas is: " + canvas.totalArea());
    }

    public void calculateTotalAreaIncludingBorder() {
        System.out.println("Total Area of the Canvas Including Border is: " + canvas.totalAreaWithBorder());
    }

    private double takeUserInput(String message) {
        double value = 0;
        String valueString;
        System.out.println(message);
        try {
            valueString = canvasScanner.nextLine();
            value = Double.parseDouble(valueString);
        } catch (Exception e) {
            System.out.println("Invalid value");
        }
        return value;
    }
}

package org.example.Helpers;

import org.example.canvas.Canvas;
import org.example.shapes.Circle;
import org.example.shapes.Rectangle;
import org.example.shapes.Square;

import java.util.Scanner;

public class CanvasHelper {
    Canvas canvas = new Canvas();
    Scanner canvasScanner = new Scanner(System.in);

    public void addNewElement() {
        System.out.println("Select the Element to add to canvas");
        System.out.println("1- Square\n2- Rectangle\n3- Circle \n9- main menu");
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
            case 1 -> addSquare();
            case 2 -> addRectangle();
            case 3 -> addCircle();
            case 9 -> {
            }
            default -> {
                System.out.println("Incorrect Input");
                addNewElement();
            }
        }
    }

    private void addSquare() {
        double len = takeUserInput("Enter Length of a side:");
        if (len > 0) {
            Square square = new Square(len);
            canvas.addElement(square);
        } else {
            System.out.println("Element Not Added");
        }
    }

    private void addCircle() {
        double radius = takeUserInput("Enter Radius of circle:");
        if (radius > 0) {
            Circle circle = new Circle(radius);
            canvas.addElement(circle);
        } else {
            System.out.println("Element Not Added");
        }
    }

    private void addRectangle() {
        double length = takeUserInput("Enter Length of rectangle:");
        double width = takeUserInput("Enter width of rectangle: ");
        if (length > 0 && width > 0) {
            Rectangle rectangle = new Rectangle(length, width);
            canvas.addElement(rectangle);
        } else {
            System.out.println("Element Not Added");
        }
    }

    public void calculateTotalArea() {
        System.out.println("Total Area of the Canvas is: " + canvas.totalArea());
    }

    private double takeUserInput(String message) {
        double value = 0;
        String valueString;
        System.out.print(message);
        try {
            valueString = canvasScanner.nextLine();
            value = Double.parseDouble(valueString);
        } catch (Exception e) {
            System.out.println("Invalid value");
        }
        return value;
    }
}

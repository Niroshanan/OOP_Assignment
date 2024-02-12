package org.example.Helpers;

import org.example.canvas.Canvas;
import org.example.shapes.Circle;
import org.example.shapes.Rectangle;
import org.example.shapes.Square;

import java.util.Scanner;

public class CanvasHelper {
    static Canvas canvas = new Canvas();
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
            case 1 -> {
                System.out.print("Enter Length of a side:");
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
                System.out.print("Enter width of rectangle: ");
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
        double value=0;
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

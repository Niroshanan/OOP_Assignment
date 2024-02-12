package org.example.Helpers;

import org.example.canvas.Canvas;
import org.example.shapes.Square;

import java.util.Scanner;

public class CanvasHelper {
    static Canvas canvas = new Canvas();
    Scanner canvasScanner = new Scanner(System.in);
    public void addNewElement(){
        System.out.println("Select the Element to add to canvas");
        System.out.println("1- Square\n2- Rectangle\n3- Circle \nEnter Number:");
        String elementInputString =  canvasScanner.nextLine();
        int elementInput = 0;
        try {
            elementInput = Integer.parseInt(elementInputString);
        }
        catch (Exception e){
            System.out.println(e);
        }
        switch (elementInput){
            case 1:
                System.out.print("Enter Length of a side:");
                double len = takeUserInput();
                if(len>0){
                    Square square = new Square(len);
                    canvas.addElement(square);
                }
                break;
            case 2:
                System.out.print("Enter Length of rectangle:");
                double length = takeUserInput();
                System.out.print("Enter width of rectangle:");
                double width = takeUserInput();
                if(length>0 && width>0){
                    Square square = new Square(length);
                    canvas.addElement(square);
                }
                break;
            case 3:
                break;
            default:
                System.out.println("Incorrect Input");
                addNewElement();
        }
    }

    public void calculateTotalArea(){
        System.out.println(canvas.totalArea());
    }

    private double takeUserInput(){
        Double value= 0.0;
        try {
            value = canvasScanner.nextDouble();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return  value;
    }
}

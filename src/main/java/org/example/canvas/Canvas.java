package org.example.canvas;

import org.example.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private List<Shape> canvasElements;

    public Canvas (){
        this.canvasElements = new ArrayList<>();
    }
    public void addElement(Shape shape){
        canvasElements.add(shape);
    }
    public double totalArea(){
        double totalArea = 0;
        for ( Shape shape: canvasElements) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
    public double totalAreaWithBorder(){
        double totalAreaWithBorder = 0;
        for (Shape shape: canvasElements) {
            totalAreaWithBorder += shape.calculateAreaWithBorders();
        }
        return totalAreaWithBorder;
    }
    public double totalAreaWithoutBorder(){
        double totalAreaWithoutBorder = 0;
        for (Shape shape: canvasElements) {
            totalAreaWithoutBorder += shape.calculateAreaWithoutBorders();
        }
        return totalAreaWithoutBorder;
    }

}

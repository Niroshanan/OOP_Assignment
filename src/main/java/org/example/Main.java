package org.example;

import org.example.Helpers.CanvasHelper;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static CanvasHelper canvasHelper = new CanvasHelper();

    public static void main(String[] args) {
        loadMenu();
    }

    static void loadMenu() {
        System.out.println("\n-----AREA CALCULATOR-----");
        System.out.println("1 -Add New Element\n" +
                "2- Get Total Area Including Border\n" +
                "3- Get Total Area of Only border \n" +
                "4- Get Total Area Without Border \n" +
                "9- EXIT ");
        System.out.print("Enter Input: ");
        String inputString = scanner.nextLine();
        int menuInput = 0;
        try {
            menuInput = Integer.parseInt(inputString);
        } catch (Exception e) {
            System.out.println("Invalid Input");
            loadMenu();
        }
        switch (menuInput) {
            case 1 -> {
                canvasHelper.addNewElement();
                loadMenu();
            }
            case 2 -> {
                canvasHelper.calculateTotalAreaIncludingBorder();
                loadMenu();
            }
            case 3 -> {
                canvasHelper.calculateTotalAreaOfBorder();
                loadMenu();
            }
            case 4 -> {
                canvasHelper.calculateTotalAreaWithoutBorder();
                loadMenu();
            }
            case 9 -> {
                System.out.println("Exited\n");
                exit(0);
            }
            default ->{
                System.out.println("Incorrect Input");
                loadMenu();
            }
        }
    }
}
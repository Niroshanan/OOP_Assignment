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
        System.out.println("1 -Add new Element\n2- Get Total Area \n9- EXIT ");
        System.out.print("Enter Input: ");
        String inputString = scanner.nextLine();
        int menuInput = 0;
        try {
            menuInput = Integer.parseInt(inputString);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
            loadMenu();
        }
        switch (menuInput) {
            case 1 -> {
                canvasHelper.addNewElement();
                loadMenu();
            }
            case 2 -> {
                canvasHelper.calculateTotalArea();
                loadMenu();
            }
            case 9 -> {
                System.out.println("Exited\n");
                exit(0);
            }
            default -> loadMenu();
        }
    }
}
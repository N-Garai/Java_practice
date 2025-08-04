package geometry;

import java.util.Scanner;

public class GeometryCalculator {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("=== Geometry Calculator ===");
        
        while (true) {
            displayMenu();
            int choice = getChoice();
            
            switch (choice) {
                case 1:
                    calculateCircle();
                    break;
                case 2:
                    calculateRectangle();
                    break;
                case 3:
                    System.out.println("Thank you for using Geometry Calculator!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            
            System.out.println("\nPress Enter to continue...");
            scanner.nextLine();
        }
    }
    
    private static void displayMenu() {
        System.out.println("\n--- Main Menu ---");
        System.out.println("1. Circle Calculations");
        System.out.println("2. Rectangle Calculations");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
    }
    
    private static int getChoice() {
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        return choice;
    }
    
    private static void calculateCircle() {
        System.out.println("\n--- Circle Calculator ---");
        System.out.print("Enter the radius of the circle: ");
        
        while (!scanner.hasNextDouble()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }
        
        double radius = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        
        if (radius < 0) {
            System.out.println("Radius cannot be negative!");
            return;
        }
        
        Circle circle = new Circle(radius);
        
        System.out.println("\n--- Circle Results ---");
        System.out.printf("Radius: %.2f units%n", radius);
        System.out.printf("Area: %.2f square units%n", circle.calculateArea());
        System.out.printf("Perimeter (Circumference): %.2f units%n", circle.calculatePerimeter());
        System.out.printf("Diameter: %.2f units%n", circle.getDiameter());
    }
    
    private static void calculateRectangle() {
        System.out.println("\n--- Rectangle Calculator ---");
        
        System.out.print("Enter the length of the rectangle: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }
        double length = scanner.nextDouble();
        
        System.out.print("Enter the width of the rectangle: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }
        double width = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        
        if (length < 0 || width < 0) {
            System.out.println("Length and width cannot be negative!");
            return;
        }
        
        Rectangle rectangle = new Rectangle(length, width);
        
        System.out.println("\n--- Rectangle Results ---");
        System.out.printf("Length: %.2f units%n", length);
        System.out.printf("Width: %.2f units%n", width);
        System.out.printf("Area: %.2f square units%n", rectangle.calculateArea());
        System.out.printf("Perimeter: %.2f units%n", rectangle.calculatePerimeter());
        System.out.printf("Diagonal: %.2f units%n", rectangle.getDiagonal());
        
        if (rectangle.isSquare()) {
            System.out.println("Note: This rectangle is actually a square!");
        }
    }
}


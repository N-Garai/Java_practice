//Create an interface Shape with methods getArea() and getPerimeter(). 
// Implement two classes Rectangle and Circle that implement this interface and calculate their respective area and perimeter
package Day5;
import java.lang.*;
import java.io.*;
interface Shape {
    int getArea();
    int getPerimeter();
}

class Rectangle implements Shape {
     int length;
     int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int getArea() {
        return length * width;
    }

    @Override
    public int getPerimeter() {
        return 2 * (length + width);
    }
}

class Circle implements Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int)(Math.PI * radius * radius);
    }

    @Override
    public int getPerimeter() {
        return (int)(2 * Math.PI * radius);
    }
}

class ShapeCalculator {
    public static void main(String args[]) {
        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        Shape circle = new Circle(7);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
    }
}
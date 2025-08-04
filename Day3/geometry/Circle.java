package geometry;

public class Circle {
    private double radius;
    private static final double PI = Math.PI;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double calculateArea() {
        return PI * radius * radius;
    }
    
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getDiameter() {
        return 2 * radius;
    }
    
    @Override
    public String toString() {
        return String.format("Circle[radius=%.2f, area=%.2f, perimeter=%.2f]", 
                           radius, calculateArea(), calculatePerimeter());
    }
}


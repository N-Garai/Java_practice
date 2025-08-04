package geometry;

public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double calculateArea() {
        return length * width;
    }
    
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    
    public double getLength() {
        return length;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getDiagonal() {
        return Math.sqrt(length * length + width * width);
    }
    
    public boolean isSquare() {
        return Math.abs(length - width) < 0.001; // Using small tolerance for double comparison
    }
    
    @Override
    public String toString() {
        return String.format("Rectangle[length=%.2f, width=%.2f, area=%.2f, perimeter=%.2f]", 
                           length, width, calculateArea(), calculatePerimeter());
    }
}

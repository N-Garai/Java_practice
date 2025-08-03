class Rectangle {
    int length, width;
    
    // Default constructor
    public Rectangle() {
        length = width = 1;
    }
    
    // Single parameter constructor (square)
    public Rectangle(int side) {
        length = width = side;
    }
    
    // Two parameter constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    
    public int area() {
        return length * width;
    }
    
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);
        
        System.out.println("Areas: " + r1.area() + ", " + r2.area() + ", " + r3.area());
    }
}


class Book {
    String title;
    String author;
    double price;
    
    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    // Copy constructor
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }
    
    public void display() {
        System.out.println(title + " by " + author + " - $" + price);
    }
    
    public static void main(String[] args) {
        Book original = new Book("Java Basics", "John Doe", 29.99);
        Book copy = new Book(original);
        
        original.display();
        copy.display();
    }
}


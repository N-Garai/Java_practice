class Car {
    String brand;
    String model;
    int year;
    
    // Parameterized constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    public void showDetails() {
        System.out.println(year + " " + brand + " " + model);
    }
    
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2023);
        car.showDetails();
    }
}

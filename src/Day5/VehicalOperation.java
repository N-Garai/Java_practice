/* Create an abstract class Vehicle with abstract methods start() and stop(). 
Implement two subclasses Car and Motorcycle that provide implementations for these methods. */

//package Day5;
abstract class Vehicle {
    int speed;
    public abstract void start(int speed);
    public abstract void stop(int speed);
}
class Car extends Vehicle {
    
    @Override
    public void start(int speed) {
        for(int i=0;i<speed;i++){
            System.out.println("Car is starting.."+i);
        }  
    }

    @Override
    public void stop(int speed) {
        for(int i=speed;i>=0;i--){
            System.out.println("Car is stopping.."+i);
        }
    }
}

class Motorcycle extends Vehicle {
    
   @Override
    public void start(int speed) {
        for(int j=0;j<speed;j++){
            System.out.println("motorcycle is starting.."+j);
        }  
    }

    @Override
    public void stop(int speed) {
        for(int j=speed;j>=0;j--){
            System.out.println("motorcycle is stopping.."+j);
        }
    }
}

public class VehicalOperation {
    public static void main(String[] args) {
        
        Vehicle car = new Car();
        car.start(5);
        car.stop(2);

        Vehicle motorcycle = new Motorcycle();
        motorcycle.start(3);
        motorcycle.stop(1);
    }
}



/* Create an abstract class Animal with an abstract method makeSound() and a concrete method sleep(). 
Create two subclasses Dog and Cat that extend Animal and implement the makeSound() method.
 */
package Day5;
// Abstract class Animal
abstract class Animal{
    public abstract void makeSound();
    public void sleep(){
       System.out.println("Zzzzzzzzz.....");
    }
}
// Dog class extending Animal
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Woof Woof");
    }
}
// Cat class extending Animal
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow Meow");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog.sleep();

        Animal cat = new Cat();
        cat.makeSound();
        cat.sleep();
    }
}

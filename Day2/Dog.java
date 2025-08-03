class Animal {
    String species;
    
    public Animal(String species) {
        this.species = species;
        System.out.println("Animal constructor called: " + species);
    }
}

class Dog extends Animal {
    String breed;
    
    public Dog(String species, String breed) {
        super(species);  // Call parent constructor
        this.breed = breed;
        System.out.println("Dog constructor called: " + breed);
    }
    
    public void display() {
        System.out.println("Species: " + species + ", Breed: " + breed);
    }
    
    public static void main(String[] args) {
        Dog dog = new Dog("Canine", "Golden Retriever");
        dog.display();
    }
}

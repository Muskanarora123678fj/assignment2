// Superclass Animal
class Animal {
    // Method in the superclass
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Dog inheriting from Animal
class Dog extends Animal {
    // Override method in subclass
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass Cat inheriting from Animal
class Cat extends Animal {
    // Override method in subclass
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class to demonstrate method overriding
public class Main {
    public static void main(String[] args) {
        // Create an object of Animal class
        Animal genericAnimal = new Animal();
        System.out.print("Generic animal: ");
        genericAnimal.makeSound(); // Calls makeSound() method of Animal class

        // Create an object of Dog class
        Dog myDog = new Dog();
        System.out.print("My dog: ");
        myDog.makeSound(); // Calls overridden makeSound() method of Dog class

        // Create an object of Cat class
        Cat myCat = new Cat();
        System.out.print("My cat: ");
        myCat.makeSound(); // Calls overridden makeSound() method of Cat class
    }
}








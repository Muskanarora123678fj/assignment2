// Base class
class Vehicle {
    // Method to start the vehicle
    public void start() {
        System.out.println("Vehicle is starting");
    }

    // Method to stop the vehicle
    public void stop() {
        System.out.println("Vehicle is stopping");
    }
}

// Subclass Car
class Car extends Vehicle {
    // Override start method
    @Override
    public void start() {
        System.out.println("Car is starting with a roar");
    }

    // Override stop method
    @Override
    public void stop() {
        System.out.println("Car is stopping smoothly");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    // Override start method
    @Override
    public void start() {
        System.out.println("Bike is starting with a vroom");
    }

    // Override stop method
    @Override
    public void stop() {
        System.out.println("Bike is stopping quickly");
    }
}

// Main class to demonstrate the vehicle hierarchy
public class VehicleDemo {
    public static void main(String[] args) {
        // Create instances of Car and Bike
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        // Call the start and stop methods for each vehicle
        System.out.println("Starting vehicles:");
        myCar.start(); // Output: Car is starting with a roar
        myBike.start(); // Output: Bike is starting with a vroom

        System.out.println("\nStopping vehicles:");
        myCar.stop(); // Output: Car is stopping smoothly
        myBike.stop(); // Output: Bike is stopping quickly
    }
}

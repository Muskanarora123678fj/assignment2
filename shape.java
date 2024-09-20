// Base class
class Shape {
    // Method to display the type of shape
    public void displayShape() {
        System.out.println("This is a shape.");
    }
}

// Subclass Circle
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of the circle
    public double area() {
        return Math.PI * radius * radius;
    }

    // Override displayShape method
    @Override
    public void displayShape() {
        super.displayShape(); // Call the method from Shape
        System.out.println("This is a circle.");
    }
}

// Subclass ColoredCircle
class ColoredCircle extends Circle {
    private String color;

    // Constructor
    public ColoredCircle(double radius, String color) {
        super(radius); // Call the constructor of Circle
        this.color = color;
    }

    // Method to display color
    public void displayColor() {
        System.out.println("The color of the circle is: " + color);
    }

    // Override displayShape method
    @Override
    public void displayShape() {
        super.displayShape(); // Call the method from Circle
        System.out.println("This is a colored circle.");
    }
}

// Main class to demonstrate multilevel inheritance
public class Shape {
    public static void main(String[] args) {
        // Create an instance of ColoredCircle
        ColoredCircle coloredCircle = new ColoredCircle(5.0, "Red");

        // Display shape and color
        coloredCircle.displayShape(); // Shows hierarchy of shapes
        coloredCircle.displayColor();  // Displays the color
        System.out.println("Area of the circle: " + coloredCircle.area()); // Calculate and display area
    }
}

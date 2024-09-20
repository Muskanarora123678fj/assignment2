// Abstract class Shape
abstract class Shape {
    // Abstract method draw
    abstract void draw();
}

// Circle class extending Shape
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Main class to demonstrate dynamic method dispatch
public class ShapeTest {
    public static void main(String[] args) {
        // Create an array of Shape references
        Shape[] shapes = new Shape[2];
        
        // Assign Circle and Rectangle objects to Shape references
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        
        // Call draw() method on each Shape reference
        for (Shape shape : shapes) {
            shape.draw();  // Dynamic method dispatch occurs here
        }
    }
}





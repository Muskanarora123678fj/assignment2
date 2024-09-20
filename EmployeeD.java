// Base class
class Employee {
    // Method to be overridden
    public String getRole() {
        return "Employee";
    }
}

// Subclass Manager
class Manager extends Employee {
    // Override getRole method
    @Override
    public String getRole() {
        return "Manager";
    }
}

// Subclass Developer
class Developer extends Employee {
    // Override getRole method
    @Override
    public String getRole() {
        return "Developer";
    }
}

// Main class to demonstrate dynamic method dispatch
public class EmployeeD {
    public static void main(String[] args) {
        // Create instances of Manager and Developer
        Employee emp1 = new Manager();
        Employee emp2 = new Developer();

        // Invoke the getRole method using Employee references
        System.out.println("Role of emp1: " + emp1.getRole()); // Output: Manager
        System.out.println("Role of emp2: " + emp2.getRole()); // Output: Developer
    }
}



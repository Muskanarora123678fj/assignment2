class Student {
    // Encapsulated fields
    private String name;
    private int grade;

    // Constructor
    public Student(String name, int grade) {
        setName(name); // Use setter for validation
        setGrade(grade); // Use setter for validation
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name with validation
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Name cannot be empty.");
        } else {
            this.name = name;
        }
    }

    // Getter for grade
    public int getGrade() {
        return grade;
    }

    // Setter for grade with validation
    public void setGrade(int grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("Grade must be between 0 and 100.");
        } else {
            this.grade = grade;
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Grade: " + grade);
    }
}

public class Student {
    public static void main(String[] args) {
        // Creating a Student object with valid data
        Student student = new Student("Alice", 85);
        student.displayStudentDetails();

        // Attempt to set invalid data
        student.setName(""); // Should show an error message
        student.setGrade(150); // Should show an error message

        // Displaying updated details
        student.displayStudentDetails(); // Should show valid name and grade
    }
}

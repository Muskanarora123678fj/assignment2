class Person {
    // Encapsulated fields
    private String name;
    private int age;
    private String address;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative.");
        } else {
            this.age = age;
        }
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }
}

public class Person {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person();

        // Setting values using setter methods
        person.setName("John Doe");
        person.setAge(25);
        person.setAddress("123 Main St");

        // Displaying values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());

        // Trying to set a negative age
        person.setAge(-5); // This will display a warning message
    }
}

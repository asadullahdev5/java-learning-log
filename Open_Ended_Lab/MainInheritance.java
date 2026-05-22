// Part F: Superclass Person
class Person {
    // Protected or private variables
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Part F: Subclass Librarian inheriting Person
class Librarian extends Person {
    private String employeeId;
    private String department;

    // Constructor initializing inherited and current fields
    public Librarian(String name, int age, String employeeId, String department) {
        super(name, age); // Calling superclass constructor
        this.employeeId = employeeId;
        this.department = department;
    }

    // Method to display complete information
    public void displayLibrarianInfo() {
        System.out.println("\n========================================");
        System.out.println("       LIBRARIAN PROFILE DETAILS        ");
        System.out.println("========================================");
        System.out.println("Name:          " + name);
        System.out.println("Age:           " + age + " years");
        System.out.println("Employee ID:   " + employeeId);
        System.out.println("Department:    " + department);
        System.out.println("========================================");
    }
}

// Main class for Task 02
public class MainInheritance {
    public static void main(String[] args) {
        // Creating Librarian object with sample data
        Librarian librarian = new Librarian("Sir Ahmed Khan", 34, "IQRA-2026-LIB", "Computer Science");
        
        // Displaying complete info
        librarian.displayLibrarianInfo();
    }
}
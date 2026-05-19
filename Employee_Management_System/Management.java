
import java.util.Scanner;
// Employee Mangement
// Parent Class

class Employee {

    int id;
    String name;
    float sallery;

    // Constructor
    public Employee(int id, String name, float sallery) {
        this.id = id;
        this.name = name;
        this.sallery = sallery;
    }

    //Display Method
    void displayInfo() {
        System.out.print("=================");
        System.out.println("Employee ID" + id);
        System.out.println("Employee Name" + name);
        System.out.println("Employee Sallery" + sallery);

    }
}
// Child Class Manager

class Manager extends Employee {

    String department;

    // Child Constructor
    public Manager(String department) {
        super(0, null, 0);
        this.department = department;
    }

    void displayInfo() {
        System.out.print("Employee Department: " + department);
    }
}
// Child Class Developer

class Developer extends Employee {

    String programmingLanguage;

    // Child Constructor
    public Developer() {
        super(0, null, 0);
    }

}

// Main class
public class Management {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee[] employees = new Employee[10];

        int count = 0;
        // Console Menu
        while (true) {
            System.out.println("===========EMPLOYEE MANAGEMENT SYSTEM===============");
            System.out.println("1) Add Manager");
            System.out.println("2) Add Devloper");
            System.out.println("3) Display All Employees");
            System.out.println("4) EXIT");

            System.out.println("ENTER CHOICE: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    if (count < employees.length) {
                        System.out.println("Employee ID: ");
                        int id = input.nextInt();
                        input.nextLine();

                        System.out.println("Employee Name: ");
                        String name = input.nextLine();

                        System.out.println("Employee Department: ");
                        String department = input.nextLine();

                        employees[count] = new Employee(id, name, department);
                        count++;

                        System.out.println("Added Employee SuccessFully");

                    } else {
                        System.out.println("Storage Full");
                    }
                    break;

                case 2:

                    for (int i = 0; i < count; i++) {
                        books[i].display();
                    }
                    break;

                case 3:
                    System.out.println("Enter Book ID to Search: ");
                    int SearchID = input.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (books[i].getBookId() == SearchID) {
                            books[i].display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book Not Found");
                    }
                    break;

                case 4:

                    System.out.println("Exiting...");

                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");

            }
        }

    }
}

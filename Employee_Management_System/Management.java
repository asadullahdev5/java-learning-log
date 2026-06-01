import java.util.Scanner;

// Parent Abstract Class
abstract class Employee {

    private final int id;
    private final String name;
    private final float salary;

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public abstract float calculateSalary();

    @Override
    public String toString() {
        return "Employee ID: " + id +
                "\nEmployee Name: " + name +
                "\nFinal Salary: " + calculateSalary();
    }
}

// Manager Class
class Manager extends Employee {

    private final String department;

    public Manager(int id, String name, float salary, String department) {
        super(id, name, salary);
        this.department = department;
    }

    @Override
    public float calculateSalary() {
        return getSalary() + 5000;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDepartment: " + department +
                "\n----------------------";
    }
}

// Developer Class
class Developer extends Employee {

    private final String programmingLanguage;

    public Developer(int id, String name, float salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public float calculateSalary() {
        return getSalary() + 3000;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nProgramming Language: " + programmingLanguage +
                "\n----------------------";
    }
}

// Main Class
public class Management {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Employee[] employees = new Employee[10];

        int count = 0;

        while (true) {

            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Manager");
            System.out.println("2. Add Developer");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = input.nextInt();

            switch (choice) {

                case 1:

                    if (count < employees.length) {

                        System.out.print("Enter ID: ");
                        int mid = input.nextInt();
                        input.nextLine();

                        System.out.print("Enter Name: ");
                        String mname = input.nextLine();

                        System.out.print("Enter Salary: ");
                        float msalary = input.nextFloat();
                        input.nextLine();

                        System.out.print("Enter Department: ");
                        String dept = input.nextLine();

                        employees[count] = new Manager(mid, mname, msalary, dept);

                        count++;

                        System.out.println("Manager Added Successfully");
                    } else {
                        System.out.println("Storage Full");
                    }

                    break;

                case 2:

                    if (count < employees.length) {

                        System.out.print("Enter ID: ");
                        int did = input.nextInt();
                        input.nextLine();

                        System.out.print("Enter Name: ");
                        String dname = input.nextLine();

                        System.out.print("Enter Salary: ");
                        float dsalary = input.nextFloat();
                        input.nextLine();

                        System.out.print("Enter Programming Language: ");
                        String lang = input.nextLine();

                        employees[count] = new Developer(did, dname, dsalary, lang);

                        count++;

                        System.out.println("Developer Added Successfully");

                    } else {
                        System.out.println("Storage Full");
                    }

                    break;

                case 3:

                    if (count == 0) {
                        System.out.println("No Employees Found");
                    } else {

                        for (int i = 0; i < count; i++) {

                            System.out.println(employees[i]);
                        }
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
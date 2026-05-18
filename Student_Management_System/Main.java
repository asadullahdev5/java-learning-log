
import java.util.Scanner;

// Class Student
class Student {

    int id;
    String name;
    float marks;

    // Constructor
    Student(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Method
    void displayStudent() {
        System.out.println("ID:" + id);
        System.out.println("NAME: " + name);
        System.out.println("MARKS:" + marks);
        System.out.println();
    }
}

// Main class
class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] Students = new Student[5];

        int count = 0;
        // Console Menu
        while (true) {
            System.out.println("===========STUDENT MANAGEMENT SYSTEM===============");
            System.out.println("1) ADD STUDENT");
            System.out.println("2) DISPLAY STUDENT");
            System.out.println("3) SEARCH STUDENT");
            System.out.println("4) EXIT");

            System.out.println("ENTER CHOICE: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    if (count < Students.length) {
                        System.out.println("Enter ID: ");
                        int id = input.nextInt();
                        input.nextLine();
                        System.out.println("Enter Name: ");
                        String name = input.nextLine();
                        input.nextLine();
                        System.out.println("Enter Marks: ");
                        float marks = input.nextFloat();

                        Students[count] = new Student(id, name, marks);
                        count++;

                        System.out.println("Student Added SuccessFully");

                    } else {
                        System.out.println("Storage Full");
                    }
                    break;

                case 2:

                    for (int i = 0; i < count; i++) {
                        Students[i].displayStudent();
                    }
                    break;

                case 3:
                    System.out.println("Enter Student ID to Search: ");
                    int SearchID = input.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (Students[i].id == SearchID) {
                            Students[i].displayStudent();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student Not Found");
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

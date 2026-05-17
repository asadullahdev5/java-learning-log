
import java.util.Scanner;
import java.util.UUID;

public class employees implements Utility {

    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;
    String emp_showroom_name;
    Scanner input = new Scanner (System.in);

    @Override
    public void get_details() {
        System.out.println("Employee_ID: " + emp_id);
        System.out.println("Employee_Name: " + emp_name);
        System.out.println("Employee_Age: " + emp_age);
        System.out.println("Employee_Department: " + emp_department);
        System.out.println("Emp_ShowRoom_Name: " + emp_showroom_name);
    }

    @Override
    public void set_details() {
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("╔═══      EMPLOYEE MANAGEMENT  ═════╗");
        System.out.println("║       ENTER EMPLOYEE DETAILS      ║");
        System.out.println("╚═══════════════════════════════════╝");
        System.out.println();

        System.out.println("Employee_Name: ");
        emp_name = input.nextLine();
        System.out.println("Employee_Age: ");
        emp_age = input.nextInt();
        input.nextLine();
        System.out.println("Employee_Department: ");
        emp_department = input.nextLine();
        System.out.println("Emp_ShowRoom_Name: ");
        emp_showroom_name = input.nextLine();

    }

}

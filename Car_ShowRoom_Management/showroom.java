import java.util.Scanner;
public class showroom implements Utility {
    String showroom_name;
    String showroom_address;
    String manager_name;
    int total_employees ;
    int total_cars_in_stock; 
    Scanner input = new Scanner (System.in);

    
    @Override
    public void get_details(){
        System.out.println("ShowRoom_Name: " + showroom_name);
        System.out.println("ShowRoom_Address: " + showroom_address);
        System.out.println("Manager_Name: " + manager_name);
        System.out.println("Total_Employee: " + total_employees);
        System.out.println("Total_Car_In_Stock: " + total_cars_in_stock);

    }

    @Override
    public void set_details(){
        System.out.println("\n");
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║         SHOW ROOM SYSTEM             ║");
        System.out.println("╚══════════════════════════════════════╝");
        
        System.out.println();
        System.out.print("ShowRoom_Name:");
        showroom_name = input.nextLine();

        System.out.print("ShowRoom_Address:");
        showroom_address = input.nextLine();

        System.out.print("Manager_Name:");
        manager_name = input.nextLine();

        System.out.print("Total_Employee:");
        total_employees = input.nextInt();

        System.out.print("Total_Car_In_Stock:");
        total_cars_in_stock = input.nextInt();
    }

}

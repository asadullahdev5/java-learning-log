
import java.util.Scanner;

interface Utility {
    public void set_details();
    public void get_details();
}
public class menu {

    static void main_menu() {
        System.out.println();
        System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                  WELCOME TO SHOWROOM MANAGEMENT SYSTEM                                       ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════╝");

        System.out.println();

        System.out.println("╔═══════════════════════════════   ENTER YOUR CHOICE     ═══════════════════════════════╗");
        System.out.println("║                                                                                       ║");
        System.out.println("║    1. ADD SHOWROOMS         2. ADD CARS         3. ADD EMPLOYEES                      ║");
        System.out.println("║                                                                                       ║");
        System.out.println("║    4. GET SHOWROOMS        5. GET EMPLOYEES        6.  GET CARS                       ║");
        System.out.println("║                                                                                       ║");
        System.out.println("║                            ENTER 0 TO EXIT                                            ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════════════════════════╝");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        showroom Showroom[] = new showroom[5];
        employees Employees[] = new employees[5];
        car Car[] = new car[5];
        int showroom_counter = 0;
        int car_counter = 0;
        int employee_counter = 0;
        int choice = 100;
        while (choice != 0){
            
            main_menu();
            choice = input.nextInt();

            while(choice !=9 && choice !=0){
                switch (choice) {
                    case 1:
                        Showroom [showroom_counter] = new showroom();
                        Showroom [showroom_counter].set_details();
                        showroom_counter ++;
                        System.out.println();
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");   
                        choice = input.nextInt();
                        break;
                    case 2:
                        Car [car_counter] = new car();
                        Car [car_counter].set_details();
                        car_counter ++;
                        System.out.println();
                        System.out.println("2].ADD NEW Car");
                        System.out.println("9].GO BACK TO MAIN MENU");   
                        choice = input.nextInt();
                        break;                                            
                
                    case 3:
                        Employees [employee_counter] = new employees();
                        Employees [employee_counter].set_details();
                        employee_counter ++;                    
                        System.out.println();
                        System.out.println("2].ADD NEW Employee");
                        System.out.println("9].GO BACK TO MAIN MENU");   
                        choice = input.nextInt();
                        break;                 
                
                    case 4:
                        for (int i = 0; i < showroom_counter; i++) {
                            Showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = input.nextInt();
                        break;               
            
                    case 5:
                        for (int i = 0; i < employee_counter; i++) {
                            Employees[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = input.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < car_counter; i++) {
                            Car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = input.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;                
                
                
                
                }

            }
        }

    }
}

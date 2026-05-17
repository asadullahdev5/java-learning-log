
import java.util.Scanner;

public class menu {

    static void main_menu() {
        System.out.println();
        System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                 🚗 WELCOME TO SHOWROOM MANAGEMENT SYSTEM 🚗                                 ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════╝");

        System.out.println();

        System.out.println("╔═══════════════════════════════ 📋 ENTER YOUR CHOICE 📋 ═══════════════════════════════╗");
        System.out.println("║                                                                                       ║");
        System.out.println("║   1️⃣  ADD SHOWROOMS           2️⃣  ADD EMPLOYEES          3️⃣  ADD CARS               ║");
        System.out.println("║                                                                                       ║");
        System.out.println("║   4️⃣  GET SHOWROOMS           5️⃣  GET EMPLOYEES          6️⃣  GET CARS               ║");
        System.out.println("║                                                                                       ║");
        System.out.println("║                           ❌ ENTER 0 TO EXIT ❌                                      ║");
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

            while(choice !=9 && choice !=0);
        }

    }
}

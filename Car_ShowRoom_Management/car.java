import java.util.Scanner;


public class car implements Utility {
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_Price;
    String car_transmission;
    Scanner input = new Scanner (System.in);

    @Override
    public void get_details() {
        System.out.println("Car_Name: "+ car_name);
        System.out.println("Car_Color: "+ car_color);
        System.out.println("Car_Fuel_Type: "+ car_fuel_type);
        System.out.println("Car_Price: "+ car_Price);
        System.out.println("Car_Transmission: "+ car_transmission);

    }

    @Override
    public void set_details() {
        System.out.println("╔════════🚗 CAR MANAGEMENT  🚗════════╗");
        System.out.println("║           ENTER CAR DETAILS          ║");
        System.out.println("╚══════════════════════════════════════╝");   
        
        System.out.println("Car_Name: ");
        car_name = input.nextLine();
        System.out.println("Car_Color: ");
        car_color = input.nextLine();
        System.out.println("Car_Fuel_Type: ");
        car_Price = input.nextInt();
        System.out.println("Car_Transmission: ");
        car_transmission = input.nextLine();
    }
}

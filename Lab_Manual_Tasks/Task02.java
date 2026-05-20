
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        
        double total_distance = 0;
                
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 7; i++){
            System.out.println("Enter Distance");
            double distance = input.nextDouble();
            total_distance += distance;

        } System.out.println("Total Distance = " + total_distance + " meters");

        
    }

}

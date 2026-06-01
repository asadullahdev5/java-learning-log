import java.time.LocalDateTime;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Original Price:");
        double originalPrice = input.nextDouble();

        System.out.println("Enter Discount Percentage:");
        double discountPercentage = input.nextDouble();

        double discountAmount = originalPrice * discountPercentage / 100;
        double finalPrice = originalPrice - discountAmount;

        LocalDateTime now = LocalDateTime.now();

        System.out.println("----- BILL -----");
        System.out.println("Original Price: " + originalPrice);
        System.out.println("Discount %: " + discountPercentage);
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("Date & Time: " + now);

        input.close();
    }
}
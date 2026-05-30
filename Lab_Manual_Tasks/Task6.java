import java.util.Date;
import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 1. Current Date and Time
        System.out.println("===== CURRENT DATE AND TIME =====");

        Date currentDate = new Date();

        System.out.println("Current Date and Time: " + currentDate);

        // 2. Math Operations
        System.out.println("\n===== MATH OPERATIONS =====");

        // User input
        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        // Square Root
        double squareRoot = Math.sqrt(number);

        // Trigonometric Functions
        double sineValue = Math.sin(number);
        double cosineValue = Math.cos(number);
        double tangentValue = Math.tan(number);

        // Power Calculation
        System.out.print("Enter exponent value: ");
        double exponent = input.nextDouble();

        double powerResult = Math.pow(number, exponent);

        // Random Number
        double randomNumber = Math.random();

        // 3. Formatted Output
        System.out.println("\n===== RESULTS =====");

        System.out.printf("Square Root of %.2f = %.2f\n",
                number, squareRoot);

        System.out.printf("Sine of %.2f = %.4f\n",
                number, sineValue);

        System.out.printf("Cosine of %.2f = %.4f\n",
                number, cosineValue);

        System.out.printf("Tangent of %.2f = %.4f\n",
                number, tangentValue);

        System.out.printf("%.2f raised to power %.2f = %.2f\n",
                number, exponent, powerResult);

        System.out.printf("Random Number between 0 and 1 = %.5f\n",
                randomNumber);

        System.out.println("\n===== PROGRAM COMPLETED =====");

        input.close();
    }
}
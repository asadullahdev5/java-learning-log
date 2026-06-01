import java.util.Scanner;

public class Task04{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = input.nextDouble();

        System.out.println("Enter operator (+, -, *, /):");
        char operator = input.next().charAt(0);

        System.out.println("Enter second number:");
        double num2 = input.nextDouble();

        double result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } 
        else if (operator == '-') {
            result = num1 - num2;
        } 
        else if (operator == '*') {
            result = num1 * num2;
        } 
        else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Cannot divide by zero");
                input.close();
                return;
            }
        } 
        else {
            System.out.println("Invalid operator");
            input.close();
            return;
        }

        System.out.println("Result = " + result);

        input.close();
    }
}
import java.util.*;

public class calculator {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Input two Numbers From User

        System.out.print("Enter First Number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter Second Number: ");
        double num2 = input.nextDouble();

        // Input Operator

        System.out.println("Enter Operator (+ , - , / , *)");
        char op = input.next().charAt(0);

        double result;

        // Conditions

        if (op == '+') {
            System.out.println("Addition:" + (num1 + num2));
        } else if (op == '-') {
                System.out.print("Subtraction" + (num1 - num2));
        
        } else if (op == '/') {
                System.out.println("Division" + (num1 / num2));
        
        }else if (op == '*') {
                System.out.println("Multiplication:" + (num1 * num2));        
        } else{
                System.out.println("Please Choose a Valid Operator"); 
        }
    }

}
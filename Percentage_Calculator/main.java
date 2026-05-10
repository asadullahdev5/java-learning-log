/*  Write a program to calculate Percenateg of a given student board exam CGPA 
using marks of five subjects must be taken as input from the keyboard
*/
import java.util.*;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        // 5 subjects ke marks input
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter Your Marks Here: ");
            int marks = input.nextInt();

            sum += marks;
        }

        // Total marks
        int totalMarks = 5 * 100;

        // Percentage calculation
        double percentage = (sum / (double) totalMarks) * 100;

        // Grade system using if-else
        if (percentage >= 90) {
            System.out.println("Your Grade is A+");
        }

        else if (percentage >= 80) {
            System.out.println("Your Grade is A");
        }

        else if (percentage >= 70) {
            System.out.println("Your Grade is B+");
        }

        else if (percentage >= 60) {
            System.out.println("Your Grade is B");
        }

        else if (percentage >= 50) {
            System.out.println("Your Grade is C");
        }

        else {
            System.out.println("You Failed");
        }

        // Percentage print
        System.out.println("Your Percentage is: " + percentage + "%");
    }
}
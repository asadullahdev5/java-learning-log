import java.util.Scanner;

public class Task001 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take exam score from user
        System.out.print("Enter your exam score: ");
        int score = input.nextInt();

        // Check pass or fail
        if (score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        input.close();
    }
}
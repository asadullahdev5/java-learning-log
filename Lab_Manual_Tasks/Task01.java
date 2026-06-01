
/*Task Description: 
Write a Java program that handles user input from the console for first name, last name, and age. 
Then, output a welcome message that includes their full name and calculates their age in 5 years.
  */

import java.util.Scanner;
public class Task01{
    public static void main(String args[]){
        Scanner input  = new Scanner(System.in);
        System.out.println("First Name: ");
        String firstName = input.nextLine();
        System.out.println("last Name: ");
        String lastName = input.nextLine();
        System.out.println("Age: ");
        int age = input.nextInt();

        int calculated_age = age + 5;


        // Output

        System.out.println("Welcome");
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Your Age in 5 Years: " + calculated_age);

    }
}
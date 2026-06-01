// Number Triangle Pattren
import java.util.*;
public class Pattren2{
    public static void printPattren(int n){
        int i , j;
        int spaces = 0;

        // Outer loop
        for (i = 1; i <= n; i++) {
            // inner loop to print space
            for (j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // inner loop to print numbers
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // print new line each row
            System.out.println();
        }
    } 
    
    // Driver Function

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number Here: ");
        int n = input.nextInt();
        printPattren(n);

    }
}
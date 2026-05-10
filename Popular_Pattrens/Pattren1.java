/* Square Hollow Pattern
This program prints a square where the border is filled with stars (*), and the inside is hollow (filled with spaces). */

import java.util.*;

public class Pattren1 {
    public static void printPattren(int n)
    {
        int i , j;

        //outer loop

        for ( i = 0; i < n; i++) {

            // inner loop

            for (j = 0; j < n; j++) {

                if( i ==0 || j ==0 || i == n-1 || j == n-1){
                    System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
        
    } // Driver Function

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Number Here: ");
        int n = input.nextInt();
        printPattren(n);
    }
}
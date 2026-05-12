/* Square  Pattern */

import java.util.*;

public class Pattren12 {
    public static void printPattren(int n)
    {
        int i , j;

        //outer loop

        for ( i = 0; i < n; i++) {

            // inner loop

            for (j = 0; j < n; j++) {
                
                System.out.print("*");

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
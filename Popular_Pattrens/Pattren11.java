// Butterfuly pattren

import java.util.*;

public class Pattren11 {

    public static void printPattren(int n) {
        int i, j;

        // Upper Half
        // First Part
        // outer loop
        for (i = 1; i <= n; i++) {

            //inner loop
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces loop
            int spaces = 2 * (n - i);
            for (j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (j = 01; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for (i = n; i >= 1; i--) {

            //inner loop
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces loop
            int spaces = 2 * (n - i);
            for (j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (j = 01; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num here:");
        int n = input.nextInt();
        printPattren(n);
    }
}  


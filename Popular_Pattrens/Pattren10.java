// Diamond Pattren

import java.util.*;

public class Pattren10{
    public static void printPattern(int n){
        int i , j , k ;
        
        //Diamond Upper Half
        //outer loop for rows

        for (i = 1; i<= n ; i++){
            // for spaces another loop
            for ( k = 1; k <= n-i ; k++) {
                System.out.print(" ");
            }
            // inner Loop
            for (j = 1; j <=2*i-1; j++) {
                    System.out.print("*");
            }
            System.out.println();
        } 
        //Diamond Lower Half
        for (i = n; i >= 1 ; i--){
            // for spaces another loop
            for ( k = 1; k <= n-i ; k++) {
                System.out.print(" ");
            }
            // inner Loop
            for (j = 1; j <=2*i-1; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }

    } // Driver Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num here:");
        int n = input.nextInt();
        printPattern(n);
    }
}

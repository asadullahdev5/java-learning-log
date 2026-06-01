// Palindrome Trinagular

import java.util.*;

public class Pattren09{
    public static void printPattern(int n){
        int i , j , k ;

        //outer loop for rows

        for (i = 1; i<= n ; i++){
            // for spaces another loop
            for ( k = 1; k <= n-i ; k++) {
                System.out.print(" ");
            }
            // inner Loop
            for (j = 1; j <=n; j++) {
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

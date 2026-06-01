// Zero one Triangle

import java.util.*;

public class Pattren8 {
    public static void printPattern(int n){
        int i , j ;
        int num  = 1;

        //outer loop for rows

        for (i = 1; i<= n ; i++){
            
            // inner loop for coulmns

            for (j = 1; j <=i; j++) {
                int sum = i+j;
                if ( sum % 2 == 0){
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
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

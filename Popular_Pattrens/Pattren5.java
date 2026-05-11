//Number Increasing Payramid

import java.util.*;

public class Pattren5{
    public static void printPattern(int n){
        int i , j ;

        //outer loop for rows

        for (i = 1; i<= 4 ; i++){
            
            // inner loop for coulmns

            for (j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    } // Driver Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 4 here:");
        int n = input.nextInt();
        printPattern(n);
    }
}
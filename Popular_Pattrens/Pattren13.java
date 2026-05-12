// Left Half Payramid
import java.util.*;

public class Pattren13 {

    public static void printPattren(int n) {
        int i, j,k;

        //outer loop
        for (i = 1; i <=n; i++) {
            for ( k = 1; k <=n-i; k++) {
                System.out.print(" ");
            }
            //inner loop
            for (j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    // Driver Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number Here:");
        int n = input.nextInt();
        printPattren(n);
    }
}


import java.util.*;

public class Pattren3 {

    public static void printPattren(int n) {
        int i, j;

        //outer loop
        for (i = 1; i <= n; i++) {
            
            //inner loop
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
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

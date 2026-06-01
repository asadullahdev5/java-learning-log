import java.util.*;
public class leap{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        // User Input Year
        System.out.println("Enter a Year: ");
        int num = input.nextInt();


        if (((num % 4 == 0) && (num % 100 != 0)) || (num % 400 == 0)) {
            System.out.println("This is Leap Year");
        } else {
            System.out.println("This is Not a Leap Year");
        }
        }
    }

import java.util.Scanner;

public class Task004 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter month number (1-12): ");
        int month = input.nextInt();

        input.nextLine(); // clear buffer

        System.out.print("Enter hemisphere (Northern/Southern): ");
        String hemisphere = input.nextLine();

        String season = "";

        // Input Validation
        if (month < 1 || month > 12) {
            System.out.println("Invalid month! Please enter a value between 1 and 12.");
        } else {

            // Switch statement for seasons
            switch (month) {

                // December, January, February
                case 12:
                case 1:
                case 2:

                    if (hemisphere.equalsIgnoreCase("Northern")) {
                        season = "Winter";
                    } else {
                        season = "Summer";
                    }
                    break;

                // March, April, May
                case 3:
                case 4:
                case 5:

                    if (hemisphere.equalsIgnoreCase("Northern")) {
                        season = "Spring";
                    } else {
                        season = "Autumn";
                    }
                    break;

                // June, July, August
                case 6:
                case 7:
                case 8:

                    if (hemisphere.equalsIgnoreCase("Northern")) {
                        season = "Summer";
                    } else {
                        season = "Winter";
                    }
                    break;

                // September, October, November
                case 9:
                case 10:
                case 11:

                    if (hemisphere.equalsIgnoreCase("Northern")) {
                        season = "Autumn";
                    } else {
                        season = "Spring";
                    }
                    break;

                default:
                    System.out.println("Invalid input.");
            }

            // Display result
            System.out.println("Season: " + season);
        }

        input.close();
    }
}
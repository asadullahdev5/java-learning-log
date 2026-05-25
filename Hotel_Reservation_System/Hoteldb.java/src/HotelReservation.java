
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.ResultSet;

public class HotelReservation {

    private static final String url = "jdbc:mysql://localhost:3306/hotel_db";
    private static final String username = "root";
    private static final String password = "asadiu09-0325";

    public static void main(String[] args) {

        try {
            // JDBC Driver Load
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Database Connect
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            while (true) {

                System.out.println();
                System.out.println("Hotel MANAGEMENT SYSTEM");
                Scanner scanner = new Scanner(System.in);
                System.out.println("1. Reserve a Room");
                System.out.println("2. View Reservations");
                System.out.println("3. Get Room Number");
                System.out.println("4. Update Reservations");
                System.out.println("5. Delete Reservations");
                System.out.println("0. Exit");
                System.out.println("Choose an Option: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        reserveRoom(con, scanner);
                        break;
                    case 2:
                        viewReservvation(con, scanner);
                        break;
                    case 3:
                        getRoomNumber(con, scanner);
                        break;
                    case 4:
                        updateReservvation(con, scanner);
                        break;
                    case 5:
                        deleteReservvation(con, scanner);
                        break;
                    case 0:
                        exit();
                        scanner.close();
                    default:
                        System.out.println("Invalid Choice. Try Again");
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void reserveRoom(Connection connection, Scanner scanner) {
        try {
            System.out.print("Enter Guest Name: ");
            String guestName = scanner.next();
            scanner.nextLine();
            System.out.print("Enter Room Number: ");
            int roomNumber = scanner.nextInt();
            System.out.print("Enter Contact Number: ");
            String contactNumber = scanner.next();

            String sql = "INSERT INTO reservations (guest_name, room_number, contact_number)"
                    + "values('" + guestName + "' , " + roomNumber + ",'" + contactNumber + "')";

            try (Statement statement = connection.createStatement()) {
                int affectRows = statement.executeUpdate(sql);

                if (affectRows > 0) {
                    System.out.println("Reservation Successfull");
                } else {
                    System.out.println("Reservation Failed");
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

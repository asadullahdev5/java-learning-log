
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.stream.Stream;

public class HotelReservation {

    private static final String url = "jdbc:mysql://localhost:3306/hotel_db";
    private static final String username = "root";
    private static final String password = "";

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
                        viewReservation(con);
                        break;
                    case 3:
                        getRoomNumber(con, scanner);
                        break;
                    case 4:
                        updateReservation(con, scanner);
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

    public static void reserveRoom(Connection con, Scanner scanner) {
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

            try (Statement statement = con.createStatement()) {
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

    private static void viewReservation(Connection con) throws SQLException {
        String sql = "SELECT reservation_id , guest_name , room_number, reservation_date From reservations";

        try (Statement statement = con.createStatement(); ResultSet resultSet = statement.executeQuery(sql)) {
            {
                System.out.println("Current Reservations");

                while (resultSet.next()) {
                    int reservationId = resultSet.getInt("reservation_id");
                    String guestName = resultSet.getString("guest_name");
                    int roomNumber = resultSet.getInt("room_number");
                    String contactNumber = resultSet.getString("contact_number");
                    String reservationDate = resultSet.getTimestamp("reservation_date").toString();

                    System.out.print(reservationId, guestName, roomNumber, contactNumber, reservationDate);
                }

                System.out.println();
            }
        }

    }

    private static void getRoomNumber(Connection con, Scanner scanner) {
        try {
            System.out.println("Enter reservation ID: ");
            int reservationId = scanner.nextInt();
            System.out.println("Enter Guest Name: ");
            String guestName = scanner.next();
            String sql = "SELECT room_number FROM reservations" + "WHERE reservation_id = " + reservationId + "AND guest_name = '" + guestName + "'";

            try (Statement statement = con.createStatement(); ResultSet resultSet = statement.executeQuery(sql)) {

                if (resultSet.next()) {
                    int roomNumber = resultSet.getInt("room_number");
                    System.out.println("Room Number For Reservation Id" + reservationId + "AND guest_name = '" + guestName + " is:" + roomNumber);
                } else {
                    System.out.println("Reservation Not Found For the given Id" + reservationId + "and Guest" + guestName);
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void updateReservation(Connection con, Scanner scanner) {
        try {
            System.out.println("Enter reservation ID to update: ");
            int reservationId = scanner.nextInt();
            scanner.nextLine();

            if (!reservationExists(con, reservationId)) {
                System.out.println("Reservation not found for the given ID");
                return;

            }

            System.out.print("Enter new Guest Name: ");
            String newGuestName = scanner.next();
            scanner.nextLine();
            System.out.print("Enter new Room Number: ");
            int newRoomNumber = scanner.nextInt();
            System.out.print("Enter new Contact Number: ");
            String newContactNumber = scanner.next();

            String sql = "UPDATE reservations SET guest_name = '" + newGuestName + "' , " + "room_number = " + newRoomNumber + ", " + "conatct_number = '" + newContactNumber + "' " + "WHERE reservation_id = " + reservationId;

            try (Statement statement = con.createStatement(); ResultSet resultSet = statement.executeQuery(sql)) {
                int affectRows = statement.executeUpdate(sql);
                if (affectRows > 0) {
                    System.out.println("Reservation Updated Successfully");
                } else {
                    System.out.println("Reservation Failed");
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteReservvation(Connection con, Scanner scanner) {
        try {
            System.out.println("Enter reservation ID to delete: ");
            int reservationId = scanner.nextInt();
            scanner.nextLine();

            if (!reservationExists(con, reservationId)) {
                System.out.println("Reservation not found for the given ID");
                return;
            }

            try (Statement statement = con.createStatement(); ResultSet resultSet = statement.executeQuery(sql)) {
                int affectRows = statement.executeUpdate(sql);
                if (affectRows > 0) {
                    System.out.println("Reservation deleted Successfully");
                } else {
                    System.out.println("Reservation deletion Failed");
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static boolean reservationExists(Connection con, int reservationId) {
        try {
            String sql = "SELECT reservation_id FROM reservations WHERE reservation_id = " + reservationId;

            try (Statement statement = con.createStatement(); ResultSet resultSet = statement.executeQuery(sql)) {
                ResultSet resultSet = statement.executeQuery(sql)
                {
                    return resultSet.next();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    public static void exit() throws InterruptedException {
        System.out.println("Exiting System");
        int i = 5;
        while(i != 0){
            System.out.print(".");
            Thread.sleep(450);
            i--;
        }
        System.out.println();
        System.out.println("Thnakyou For Using Hotel Reservation System !!!");
    }
}

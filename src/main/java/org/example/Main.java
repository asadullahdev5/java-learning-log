package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ParkingService service = new ParkingService();

        System.out.println("===== CAR PARKING SYSTEM =====");

        System.out.print("Vehicle Number: ");
        String number = input.nextLine();

        System.out.print("Owner Name: ");
        String owner = input.nextLine();

        System.out.print("Vehicle Type: ");
        String type = input.nextLine();

        System.out.print("Slot Number: ");
        int slot = input.nextInt();

        Vehicle vehicle = new Vehicle(
                number,
                owner,
                type,
                slot,
                "Parked"
        );

        service.addVehicle(vehicle);
    }
}
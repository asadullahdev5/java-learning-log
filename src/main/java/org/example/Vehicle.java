package org.example;

public class Vehicle {

    private String vehicleNumber;
    private String ownerName;
    private String vehicleType;
    private int slotNumber;
    private String status;

    public Vehicle(String vehicleNumber, String ownerName,
                   String vehicleType, int slotNumber, String status) {

        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.slotNumber = slotNumber;
        this.status = status;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public String getStatus() {
        return status;
    }
}
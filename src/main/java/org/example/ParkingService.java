package org.example;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class ParkingService {

    MongoCollection<Document> collection =
            MongoConnection.getCollection();

    public void addVehicle(Vehicle vehicle) {

        Document document = new Document()
                .append("vehicleNumber", vehicle.getVehicleNumber())
                .append("ownerName", vehicle.getOwnerName())
                .append("vehicleType", vehicle.getVehicleType())
                .append("slotNumber", vehicle.getSlotNumber())
                .append("status", vehicle.getStatus());

        collection.insertOne(document);

        System.out.println("Vehicle Added Successfully!");
    }
}
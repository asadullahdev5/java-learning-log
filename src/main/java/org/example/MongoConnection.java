package org.example;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoConnection {

    private static final MongoClient client =
            MongoClients.create("mongodb://localhost:27017");

    private static final MongoDatabase database =
            client.getDatabase("ParkingDB");

    public static MongoCollection<Document> getCollection() {
        return database.getCollection("Vehicles");
    }
}
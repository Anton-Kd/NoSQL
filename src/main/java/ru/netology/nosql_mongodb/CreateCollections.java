package ru.netology.nosql_mongodb;

//
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
//import org.bson.Document;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class CreateCollections {
//    public static void main(String[] args) {
//        String uri = "mongodb://localhost";
//        MongoClient mongoClient = MongoClients.create(uri);
//        MongoDatabase database = mongoClient.getDatabase("mongoDB");
//
/// /        database.createCollection("Users");
//        MongoCollection<Document> users = database.getCollection("Users");
//
//        users.insertOne(new Document()
//                .append("id", new Object())
//                .append("name", "Anton")
//                .append("email", "fegegsj@dgdg")
//                .append("age", "21")
//
//        );
//
//    }
//}

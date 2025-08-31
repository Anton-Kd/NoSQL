package ru.netology.nosql_mongodb.errors;

public class ErrorDelete extends RuntimeException {
    public ErrorDelete(String message) {
        super(message);
    }
}

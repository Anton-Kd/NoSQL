package ru.netology.nosql_mongodb.errors;

public class SearchError extends RuntimeException {
    public SearchError(String message) {
        super(message);
    }
}

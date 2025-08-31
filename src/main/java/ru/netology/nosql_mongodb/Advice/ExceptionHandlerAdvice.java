package ru.netology.nosql_mongodb.Advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.netology.nosql_mongodb.errors.ErrorDelete;
import ru.netology.nosql_mongodb.errors.SearchError;

public class ExceptionHandlerAdvice {

    @ExceptionHandler(ErrorDelete.class)
    public ResponseEntity<String> InvalidCredentialsHandler(ErrorDelete e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(SearchError.class)
    public ResponseEntity<String> InvalidCredentialsHandler(SearchError e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
}

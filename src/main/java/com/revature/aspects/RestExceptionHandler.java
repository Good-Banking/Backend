package com.revature.aspects;

import com.revature.exceptions.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(NotLoggedInException.class)
    public ResponseEntity<Object> handleNotLoggedInException(HttpServletRequest request, NotLoggedInException message) {

        String errorMessage = "Must be logged in to perform this action!";

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(errorMessage);
    }

    @ExceptionHandler(InvalidLoginException.class)
    public ResponseEntity<Object> handleInvalidLogin(HttpServletRequest request, NotLoggedInException message) {

        String errorMessage = "Invalid credentials!";

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }

    @ExceptionHandler(DuplicateEmailFoundException.class)
    public ResponseEntity<Object> handleDuplicateEmailFoundException(HttpServletRequest request, DuplicateEmailFoundException message) {

        String errorMessage = "Email already taken!";

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    }

    @ExceptionHandler(PasswordUnderAmountException.class)
    public ResponseEntity<Object> handlePasswordUnderAmount(HttpServletRequest request, DuplicateEmailFoundException message) {

        String errorMessage = "Password needs to be longer than 3 characters!";

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    }

    @ExceptionHandler(CheckRegisterFieldsException.class)
    public ResponseEntity<Object> handleRegisterFields(HttpServletRequest request, DuplicateEmailFoundException message) {

        String errorMessage = "Please fill in missing fields!";

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    }

    @ExceptionHandler(InsufficientFundsException.class)
    public ResponseEntity<Object> handleInsufficientFundsException(HttpServletRequest request, InsufficientFundsException message) {

        String errorMessage = "Insufficient funds for this transaction!";

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    }

    @ExceptionHandler(AuthorizationException.class)
    public ResponseEntity<Object> handleAuthorizationException(HttpServletRequest request, InsufficientFundsException message) {

        String errorMessage = "Invalid credentials to access this page!";

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    }
}

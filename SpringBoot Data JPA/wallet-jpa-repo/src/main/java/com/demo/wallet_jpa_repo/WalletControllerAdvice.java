package com.demo.wallet_jpa_repo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class WalletControllerAdvice {

    @ExceptionHandler(WalletException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleWalletException(WalletException e) {
        return "Wallet Error: " + e.getMessage();
    }

    @ExceptionHandler(WalletWithdrawException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleWalletWithdrawException(WalletWithdrawException e) {
        return "Withdraw Error: " + e.getMessage();
    }

    @ExceptionHandler(InvalidUserException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public String handleInvalidUserException(InvalidUserException e) {
        return "Authentication Error: " + e.getMessage();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error ->
                errors.put(error.getField(), error.getDefaultMessage())
        );
        return errors;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleGenericException(Exception e) {
        return "Internal Server Error: " + e.getMessage();
    }
}

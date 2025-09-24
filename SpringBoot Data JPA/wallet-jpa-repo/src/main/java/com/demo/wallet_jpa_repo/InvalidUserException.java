package com.demo.wallet_jpa_repo;

public class InvalidUserException extends Exception {
    public InvalidUserException(String message) {
        super(message);
    }
}

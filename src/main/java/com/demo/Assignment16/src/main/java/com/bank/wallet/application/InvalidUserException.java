package com.bank.wallet.application;

public class InvalidUserException extends Exception {
    public InvalidUserException(String message) {
        super(message);
    }
}

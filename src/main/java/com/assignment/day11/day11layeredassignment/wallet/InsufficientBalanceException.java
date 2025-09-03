package com.assignment.day11.day11layeredassignment.wallet;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

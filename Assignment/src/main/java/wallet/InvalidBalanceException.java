package com.bank.wallet;

public class InvalidBalanceException extends Exception {
    public InvalidBalanceException(String message) {

        super(message);
    }
}

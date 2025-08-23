package com.assignment7_customexception.assignment1;

public class InvalidPinException extends Exception {
    public InvalidPinException(String message) {
        super(message);
    }
}
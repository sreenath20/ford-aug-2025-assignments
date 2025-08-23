package com.fullstackabi.assignment.Assign7.CustomException.Ex4;

public class InvalidOrderQuantityException extends RuntimeException{

    public InvalidOrderQuantityException(String message) {
        super(message);
    }
}

package com.fullstackabi.assignment.Assign7.CustomException.Ex1;

public class InvalidPINException extends Exception {
    public InvalidPINException() {
        System.out.println("Please enter a valid PIN");
    }
}

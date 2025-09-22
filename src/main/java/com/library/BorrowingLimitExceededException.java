package com.example.jpamappingassignment.library;

public class BorrowingLimitExceededException extends Exception {
    public BorrowingLimitExceededException(String message) {
        super(message);
    }
}

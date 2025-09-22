package com.demo.library.book;

public class BorrowingLimitExceedException extends RuntimeException {
    public BorrowingLimitExceedException(String message) {
        super(message);
    }
}

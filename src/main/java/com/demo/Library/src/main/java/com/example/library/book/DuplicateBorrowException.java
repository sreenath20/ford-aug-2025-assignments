package com.example.library.book;

public class DuplicateBorrowException extends Exception {
    public DuplicateBorrowException(String message) {
        super(message);
    }
}

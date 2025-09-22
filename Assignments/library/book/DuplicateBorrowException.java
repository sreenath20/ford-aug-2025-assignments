package com.demo.library.book;

public class DuplicateBorrowException extends RuntimeException {
    public DuplicateBorrowException(String message) {
        super(message);
    }
}

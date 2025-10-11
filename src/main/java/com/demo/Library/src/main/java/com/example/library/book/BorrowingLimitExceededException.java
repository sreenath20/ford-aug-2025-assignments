package com.example.library.book;

public class BorrowingLimitExceededException extends Exception{
    public BorrowingLimitExceededException(String message){
        super(message);
    }
}

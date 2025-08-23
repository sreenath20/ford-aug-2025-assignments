package com.assignment7_customexception.assignment2;

public class TicketLimitExceededException extends RuntimeException{
    public TicketLimitExceededException(String message) {
        super(message);
    }

}

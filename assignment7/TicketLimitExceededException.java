package com.assignments.assignment7;

public class TicketLimitExceededException extends RuntimeException {
    public TicketLimitExceededException(String message) {
        super(message);
    }
}

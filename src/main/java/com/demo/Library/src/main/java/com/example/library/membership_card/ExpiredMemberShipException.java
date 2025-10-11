package com.example.library.membership_card;

public class ExpiredMemberShipException extends Exception {
    public ExpiredMemberShipException(String message) {
        super(message);
    }
}

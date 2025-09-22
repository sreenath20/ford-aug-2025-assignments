package com.demo.library.membershipCard;

public class ExpiredMembershipException extends RuntimeException {
    public ExpiredMembershipException(String message) {
        super(message);
    }
}

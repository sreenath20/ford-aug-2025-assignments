package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class ExpiredMembershipException extends RuntimeException {
    public ExpiredMembershipException(String msg) { super(msg); }
}

package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class DuplicateBorrowException extends RuntimeException {
    public DuplicateBorrowException(String msg) { super(msg); }
}

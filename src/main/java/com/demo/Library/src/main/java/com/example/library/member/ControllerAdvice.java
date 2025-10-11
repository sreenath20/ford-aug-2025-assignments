package com.example.library.member;


import com.example.library.book.DuplicateBorrowException;
import com.example.library.membership_card.ExpiredMemberShipException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice

public class ControllerAdvice {
    @ExceptionHandler(MemberNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleMemberNotFound(MemberNotFoundException e) {
        return e.getMessage();
    }
    @ExceptionHandler(Exception.class)
    public String handleMemberAlreadyExistsException(Exception e) {
        return e.getMessage();
    }
    @ExceptionHandler(DuplicateBorrowException.class)
    public String handleMemberAlreadyExistsException(DuplicateBorrowException e) {
        return e.getMessage();
    }

    @ExceptionHandler(ExpiredMemberShipException.class)
    public String handleMemberAlreadyExistsException(ExpiredMemberShipException e) {
        return e.getMessage();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        Map<String, String> errors = new HashMap<>();

        e.getBindingResult().getFieldErrors().forEach(error -> {
            errors.put(error.getField(), error.getDefaultMessage());
        });
        return errors;
    }
}

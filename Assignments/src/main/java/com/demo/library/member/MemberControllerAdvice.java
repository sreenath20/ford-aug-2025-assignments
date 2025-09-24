package com.demo.library.member;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MemberControllerAdvice {

    @ExceptionHandler(MemberAlreadyExistsException.class)
    public String handleMemberAlreadyExistsException(MemberAlreadyExistsException e) {
        return e.getMessage();
    }
}

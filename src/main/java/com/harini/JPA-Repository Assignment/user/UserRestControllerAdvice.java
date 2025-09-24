package com.abc.app.user;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserRestControllerAdvice {

    @ExceptionHandler(UserException.class)
    public String handleUserException(UserException e) {
        return e.getMessage();
    }

}

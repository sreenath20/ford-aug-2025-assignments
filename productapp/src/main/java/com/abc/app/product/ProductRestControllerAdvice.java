package com.abc.app.product;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProductRestControllerAdvice {

    @ExceptionHandler(ProductException.class)
    public String exceptionHandler(ProductException e){
        return e.getMessage();
    }
}

package com.example.productcustomjpa;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ProductRestControllerAdvice {

    @ExceptionHandler(ProductException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleProductException(ProductException ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleValidationException(MethodArgumentNotValidException e) {
//        return e;
        Map<String, String> errorsMap = new HashMap<>();
        BindingResult bindingResult = e.getBindingResult();
        for(FieldError fieldError : bindingResult.getFieldErrors()) {
            errorsMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        return errorsMap;
    }

}


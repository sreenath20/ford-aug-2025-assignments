package com.abc.app.product;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ProductRestControllerAdvice {

    @ExceptionHandler(ProductException.class)
    public String exceptionHandler(ProductException e){
        return e.getMessage();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> methodArgumentNotValidException(MethodArgumentNotValidException e){
        //BindingResult bindingResult = e.getBindingResult();
        Map<String,String> errors = new HashMap<>();
        e.getBindingResult().getFieldErrors().forEach(
                fieldError -> errors.put(fieldError.getField(),fieldError.getDefaultMessage())
        );
        return errors;

    }
}

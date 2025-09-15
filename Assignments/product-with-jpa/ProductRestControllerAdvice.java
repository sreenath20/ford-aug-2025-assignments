package com.demo.product.app;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class ProductRestControllerAdvice {

    Map<String,Object> errorMap = new LinkedHashMap<>();


    @ExceptionHandler(ProductException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,Object> handleProductException(ProductException e, HttpServletRequest request) {
        errorMap.put("status",HttpStatus.BAD_REQUEST.value() );
        errorMap.put("error",HttpStatus.BAD_REQUEST.getReasonPhrase());
        errorMap.put("message",e.getMessage());
        errorMap.put("path",request.getRequestURI());
        errorMap.put("exception",e.getClass().getName());
        errorMap.put("timestamp", LocalDateTime.now().toString());
        return  errorMap;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException e, HttpServletRequest request) {
        errorMap.put("status",HttpStatus.BAD_REQUEST.value() );
        errorMap.put("error",HttpStatus.BAD_REQUEST.getReasonPhrase());
        errorMap.put("exception",e.getClass());

        e.getBindingResult().getFieldErrors().forEach((field)->{
            errorMap.put(field.getField(),field.getDefaultMessage());
        });

        errorMap.put("path",request.getRequestURI());
        errorMap.put("timestamp",LocalDateTime.now().toString());

        return  errorMap;
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String,Object> handleException(Exception e, HttpServletRequest request) {
        errorMap.put("status",HttpStatus.INTERNAL_SERVER_ERROR.value() );
        errorMap.put("error",HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        errorMap.put("message",e.getMessage());
        errorMap.put("path",request.getRequestURI());
        errorMap.put("timestamp",LocalDateTime.now().toString());
        return  errorMap;
    }

}

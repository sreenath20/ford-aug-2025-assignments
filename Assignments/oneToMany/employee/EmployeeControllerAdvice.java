package com.demo.company.employee;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class EmployeeControllerAdvice {
    private final Map<String,Object> responseMap = new LinkedHashMap<>();

    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String,Object> handleEmployeeNotFoundException(EmployeeNotFoundException e, HttpServletRequest request){

        responseMap.put("status",HttpStatus.NOT_FOUND.value());
        responseMap.put("error",HttpStatus.NOT_FOUND.getReasonPhrase());
        responseMap.put("exception",e.getClass());
        responseMap.put("message",e.getMessage());
        responseMap.put("path",request.getServletPath());
        responseMap.put("timestamp", LocalDateTime.now().toString());

        return responseMap;
    }

    @ExceptionHandler(EmployeeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,Object> handleEmployeeException(EmployeeException e, HttpServletRequest request){

        responseMap.put("status",HttpStatus.BAD_REQUEST.value());
        responseMap.put("error",HttpStatus.BAD_REQUEST.getReasonPhrase());
        responseMap.put("exception",e.getClass());
        responseMap.put("message",e.getMessage());
        responseMap.put("path",request.getServletPath());
        responseMap.put("timestamp", LocalDateTime.now().toString());

        return responseMap;
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String,Object> handleEmployeeException(Exception e, HttpServletRequest request){
        responseMap.put("status",HttpStatus.INTERNAL_SERVER_ERROR.value());
        responseMap.put("error",HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        responseMap.put("exception",e.getClass());
        responseMap.put("message",e.getMessage());
        responseMap.put("path",request.getServletPath());
        responseMap.put("timestamp", LocalDateTime.now().toString());
        return responseMap;
    }
}

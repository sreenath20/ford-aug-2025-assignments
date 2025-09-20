package com.demo.company.department;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class DepartmentControllerAdvice {

    private final Map<String,Object> resposeMap = new LinkedHashMap<>();

    @ExceptionHandler(DepartmentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,Object> handleDepartmentException(DepartmentException e, HttpServletRequest request){
        resposeMap.put("status",HttpStatus.BAD_REQUEST.value());
        resposeMap.put("error",HttpStatus.BAD_REQUEST.getReasonPhrase());
        resposeMap.put("exception",e.getClass());
        resposeMap.put("message",e.getMessage());
        resposeMap.put("path",request.getRequestURI());
        resposeMap.put("timestamp", LocalDateTime.now());
        return resposeMap;
    }


}

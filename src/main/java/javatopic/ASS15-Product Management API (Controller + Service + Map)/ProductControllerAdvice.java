package com.product_management.product;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.BindingResult;


import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ProductControllerAdvice {



    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ProductNotFoundException.class)
    public String handleProductNotFoundException(ProductNotFoundException e) {
        return e.getMessage();
        // 404
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(InvalidProductDataException.class)
    public String handleInvalidProductDataException(InvalidProductDataException e) {
        return e.getMessage();
        //400
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        //return e.getMessage();
       // BindingResult bindingResult = e.getBindingResult();
        Map<String,String> errors = new HashMap<>();
        e.getBindingResult().getFieldErrors().forEach(
                (fieldError)->errors.put(fieldError.getField(),fieldError.getDefaultMessage()));
        return errors;

    }

//    @ExceptionHandler(ProductNotFoundException.class)
//    public ResponseEntity<ErrorResponse>
//    handleProductNotFound(ProductNotFoundException ex, HttpServletRequest request)
//    {
//        ErrorResponse errorResponse = new ErrorResponse();
//        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
//        errorResponse.setError(HttpStatus.NOT_FOUND.getReasonPhrase());
//        errorResponse.setMessage(ex.getMessage());
//        errorResponse.setPath(request.getRequestURI());
//        errorResponse.setTimestamp(LocalDateTime.now());
//        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
//    }
    


}

package com.SpringBoot.src.main.java.ProductManagementAPI;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorResponseDTO> handleProductNotFound(
            ProductNotFoundException ex, HttpServletRequest request) {

        ErrorResponseDTO errorResponse = new ErrorResponseDTO();
        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setError(HttpStatus.NOT_FOUND.getReasonPhrase());
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setPath(request.getRequestURI());
        errorResponse.setTimestamp(LocalDateTime.now());

        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(InvalidProductDataException.class)
    public ResponseEntity<ErrorResponseDTO> handleInvalidProductData(
            InvalidProductDataException ex, HttpServletRequest request) {

        ErrorResponseDTO errorResponse = new ErrorResponseDTO();
        errorResponse.setStatus(HttpStatus.BAD_GATEWAY.value()); // ✅ Fixed: BAD_REQUEST instead of NOT_FOUND
        errorResponse.setError(HttpStatus.BAD_REQUEST.getReasonPhrase());
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setPath(request.getRequestURI());
        errorResponse.setTimestamp(LocalDateTime.now());

        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseDTO> handleGeneralException(
            Exception ex, HttpServletRequest request) {

        ErrorResponseDTO errorResponse = new ErrorResponseDTO();
        errorResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorResponse.setError(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        errorResponse.setMessage("An unexpected error occurred: " + ex.getMessage());
        errorResponse.setPath(request.getRequestURI());
        errorResponse.setTimestamp(LocalDateTime.now());

        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

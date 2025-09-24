package com.SpringBoot.src.main.java.ProductManagementAPI;

public class InvalidProductDataException extends Exception {
    public InvalidProductDataException(String message) {
        super(message);
    }
}

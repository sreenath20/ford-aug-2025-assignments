package com.SpringBoot.src.main.java.ProductManagementAPI;

public class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String message) {
        super(message);
    }
}

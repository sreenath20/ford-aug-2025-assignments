package com.assignment5_polymorphism.assignment4;

public interface DataValidator {
    public static boolean isnotempty(String input) {
        if (input == null || input.isEmpty()) {
            //System.out.println("Input is empty or null");
            return false;
        } else {
            //System.out.println("Input is not empty");
            return true;
        }
    }
    public abstract boolean isvalid(String input);
}

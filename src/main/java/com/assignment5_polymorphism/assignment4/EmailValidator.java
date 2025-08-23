package com.assignment5_polymorphism.assignment4;

public class EmailValidator implements DataValidator {

    @Override
    public boolean isvalid(String input) {
        if (input == null || !input.contains("@") || !input.contains(".")) {
            return false;
        }
        String[] parts = input.split("@");
        if (parts.length != 2 || parts[0].isEmpty() || parts[1].isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}

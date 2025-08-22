package com.ford.assignment5;

interface DataValidator {

    static boolean isNotEmpty(String input) {
        return input != null && !input.trim().isEmpty();
    }

    boolean isValid(String input);
}

class EmailValidator implements DataValidator {
    public boolean isValid(String input) {
        return input.contains("@");
    }
}

class PhoneValidator implements DataValidator {
    public boolean isValid(String input) {
        return input.matches("\\d{10}");
    }
}

class FormValidation {
    public static void main(String[] args) {
        System.out.println("Is not empty: " + DataValidator.isNotEmpty("hello"));

        DataValidator email = new EmailValidator();
        DataValidator phone = new PhoneValidator();

        System.out.println("Email valid: " + email.isValid("test@example.com"));
        System.out.println("Phone valid: " + phone.isValid("9876543210"));
    }
}

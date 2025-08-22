package com.assignments.assignment5;

public class PhoneValidator implements DataValidator {
    @Override
    public boolean isValid(String data) {
        return !DataValidator.isNotStringData(data) && data.matches("[0-9]{10}");
    }
}

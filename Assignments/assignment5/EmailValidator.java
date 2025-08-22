package com.assignments.assignment5;


public class EmailValidator implements DataValidator {
    @Override
    public boolean isValid(String data) {
        return !DataValidator.isNotStringData(data) && data.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,}");
    }
}

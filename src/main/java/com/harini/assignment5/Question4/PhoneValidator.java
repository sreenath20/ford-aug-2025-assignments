package com.harini.assignment5.Question4;

public class PhoneValidator implements DataValidator{
    @Override
    public boolean isValid(String input) {
        if(input.matches("(\\+91)?\\d{10}")) {
            return true;
        }
        else{
            return false;
        }
    }
}

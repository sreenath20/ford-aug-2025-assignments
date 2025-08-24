package com.harini.assignment5.Question4;

import javax.xml.validation.Validator;

public class EmailValidator implements DataValidator {
    @Override
    public boolean isValid(String input) {
        if(input.contains("@") && input.contains(".com")) {
            return true;
        }
        else{
            return false;
        }
    }
}

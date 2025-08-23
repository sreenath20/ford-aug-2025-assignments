package com.assignment5_polymorphism.assignment4;
import java.lang.*;


public class PhoneValidator implements DataValidator {
    public boolean isvalid(String input) {
        if (input.length() == 10 && (input.charAt(0)=='9' || input.charAt(0)=='8' || input.charAt(0)=='7')) {
            return true;
        }
        else  {
            return false ;
        }
    }
}

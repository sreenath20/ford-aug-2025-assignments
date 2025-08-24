package com.harini.assignment5.Question4;

public interface DataValidator {
    public static boolean isNotEmpty(String input){
        if(!input.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isValid(String input);
}

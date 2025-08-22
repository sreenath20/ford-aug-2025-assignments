package com.assignments.assignment5;

public interface DataValidator {
    static boolean isNotStringData(String data){
        return data.isEmpty();
    }
    boolean isValid(String data);
}

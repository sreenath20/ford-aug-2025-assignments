package com.assignments.assignment5;

public interface SecurityCheck {
    static void logAttempt(String user){
        System.out.println("Logging attempt for "+ user);
    }
    default void showSecurityStatus(){
        System.out.println("Security connection established");
    }
    void verifyUser(String userName,String password);
}

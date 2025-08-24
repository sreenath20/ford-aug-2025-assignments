package com.harini.assignment5.Question6;

public interface SecurityCheck {
    public static void logAttempt(String user){
        System.out.println("The user "+user+" is attempting to log");
    }
    default void showSecurityStatus(){
        System.out.println("Secure connection established");
    }
}

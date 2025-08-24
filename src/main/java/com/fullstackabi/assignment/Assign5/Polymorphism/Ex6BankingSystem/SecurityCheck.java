package com.fullstackabi.assignment.Assign5.Polymorphism.Ex6BankingSystem;

public interface SecurityCheck {


    static void logAttempt(String user) {
        System.out.println("Login Attempted by user " + user);
    }

    default void showSecurityStatus (){
        System.out.println("Security connection established");
    }

    abstract boolean verifyUser(String userName, String password);

}

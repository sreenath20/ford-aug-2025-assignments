package com.assignment5_polymorphism.assignment6;

public interface SecurityCheck {
    public static void logAttempt(String user) {
        System.out.println("Attempting to save user " + user);
    }
    default void  showSecurityStatus() {
        System.out.println("Secure connection established");
    }
    public abstract void  verifyUser(String user, String password);

}

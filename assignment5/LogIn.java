package com.assignments.assignment5;

public class LogIn implements SecurityCheck {

    @Override
    public void verifyUser(String userName, String password) {
        if(userName.equals("Raamji") && password.equals("123")){
            System.out.println("Successfully logged in");
        }
        else System.out.println("Invalid username or password");
    }
}

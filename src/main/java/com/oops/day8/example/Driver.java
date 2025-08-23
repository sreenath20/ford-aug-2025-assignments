package com.oops.day8.example;

public class Driver {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem(-1); // Example age
        try {
            votingSystem.checkEAge();
        } catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

package com.oops.day8.example;

public class VotingSystem extends UnderAgeException {
    private int age;

    public VotingSystem(int age) {
        super("You are not eligible to vote.");
        this.age = age;
    }

    public void checkEAge() throws UnderAgeException {
        if(age<0) {
            throw new UnderAgeException("Age cannot be negative.");
        }
        if (age < 18) {
            throw new UnderAgeException("You must be at least 18 years old to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }


    }



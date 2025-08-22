package com.fullstackab.OOPS.Day8;

public class VotingSystem {


    void checkAge(int age) throws UnderAgeException{
        if(age<18){
            throw new UnderAgeException("You must be at least 18 years old to vote");
        }
        if(age>=18){
            System.out.println("You are eligible to vote");
        }
    }
}

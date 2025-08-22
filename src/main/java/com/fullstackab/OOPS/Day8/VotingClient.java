package com.fullstackab.OOPS.Day8;

public class VotingClient {
    public static void main(String[] args)  {
        VotingSystem votingSystem = new VotingSystem();
        try {
            votingSystem.checkAge(15);
        }
        catch(UnderAgeException e){
            System.out.println(e.getMessage());
        }

    }
}

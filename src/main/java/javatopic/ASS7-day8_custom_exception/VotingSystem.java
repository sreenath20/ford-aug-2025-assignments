package javatopic.day8_custom_exception;

public class VotingSystem {
    public VotingSystem() {

    }

    void checkAge(int age) throws UnderAgeException {
        if(age<18){
            throw new UnderAgeException();
        }
        else{
            System.out.println("You are eligible to vote");
        }
    }
}

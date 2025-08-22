package javatopic.day8_custom_exception;

public class Driver {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
            try {
                votingSystem.checkAge(1);
            }
            catch (UnderAgeException e) {
                System.out.println(e.getMessage());
            }

    }



}

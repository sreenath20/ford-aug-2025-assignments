public class VotingSystem {

    public static void checkAge(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("You must be at least 18 years old to vote.");
        } else {
            System.out.println("You are eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(20);
            checkAge(15);
        } catch (UnderAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

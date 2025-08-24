package day5.Assignment6;

public interface SecurityCheck {
    static void logAttempt(String user) {
        System.out.println("Security log: Attempt by user " + user);
    }

    default void showSecurityStatus() {
        System.out.println("Secure connection established");
    }

    boolean verifyUser(String username, String password);
}


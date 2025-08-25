package assignment_05.banking_system;

interface SecurityCheck {
    // Static method - can be called using interface name
    static void logAttempt(String user) {
        System.out.println("Login attempt logged for user: " + user);
    }

    // Default method - provides default implementation
    default void showSecurityStatus() {
        System.out.println("Secure connection established");
    }

    // Abstract method - must be implemented by classes
    boolean verifyUser(String username, String password);
}
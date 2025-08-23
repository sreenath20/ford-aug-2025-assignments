

import java.util.Scanner;

public class ATMPinValidation {
    public static void main(String[] args) {
        final String CORRECT_PIN = "1234";
        final int MAX_ATTEMPTS = 3;
        int attempts = 0;
        boolean accessGranted = false;

        try (Scanner sc = new Scanner(System.in)) {
            while (attempts < MAX_ATTEMPTS && !accessGranted) {
                System.out.print("Enter PIN: ");
                String inputPin = sc.nextLine().trim();
                attempts++;
                if (CORRECT_PIN.equals(inputPin)) {
                    accessGranted = true;
                    System.out.println("Access Granted");
                } else {
                    int left = MAX_ATTEMPTS - attempts;
                    if (left > 0) {
                        System.out.println("Incorrect PIN. Attempts left: " + left);
                    } else {
                        System.out.println("Account Locked");
                    }
                }
            }
        }
    }
}


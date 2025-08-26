package assignment_07.atm_pin_validation;

import java.util.Scanner;

public class ATMPinValidation {
    public static void main(String[] args) {
        System.out.println("ATM PIN Validation System \n");
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);
        atm.displayWelcome();

        int attempts = 0;
        int maxAttempts = 3;
        boolean accessGranted = false;

        while (attempts < maxAttempts && !accessGranted) {
            try {
                attempts++;
                System.out.print("\nEnter PIN (Attempt " + attempts + "/" + maxAttempts + "): ");
                String enteredPin = scanner.nextLine();

                atm.validatePin(enteredPin);

                accessGranted = true;
                atm.showMainMenu();

            } catch (InvalidPinException e) {
                System.out.println("Error: " + e.getMessage());

                if (attempts < maxAttempts) {
                    System.out.println("Please try again. Remaining attempts: " + (maxAttempts - attempts));
                }
            }
        }

        if (!accessGranted) {
            System.out.println("\nAccess Denied! Too many incorrect attempts.");
            System.out.println("Your card has been blocked. Please contact your bank for assistance.");
        }
    }
}

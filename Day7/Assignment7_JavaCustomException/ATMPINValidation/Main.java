package Assignment7_JavaCustomException.ATMPINValidation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter PIN: ");
            String input = scanner.nextLine();

            try {
                ATM.validatePin(input);
                System.out.println("Access Granted. Welcome!");
            } catch (InvalidPinException e) {
                // Friendly message as required by assignment
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

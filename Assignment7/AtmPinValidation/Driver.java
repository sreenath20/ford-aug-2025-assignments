package Assignment7.AtmPinValidation;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        try {
            atm.validatePin(pin);
            System.out.println("Access Granted. Welcome!");
        } catch (InvalidPinException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

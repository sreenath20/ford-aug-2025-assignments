package assignment2.assignment2Part1;

import java.util.Scanner;

public class ATMPinValidation {
    public static void main(String[] args) {
        Integer pinNumber = 1234;
        int attemptNumber = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly enter you ATM pin number");
        Integer pinNumberInput = scanner.nextInt();

        while (attemptNumber <= 3) {
            if (pinNumberInput.equals(pinNumber)) {
                System.out.println("Access Granted");
                break;
            } else if (attemptNumber == 3) {
                System.out.println("Account Locked");
            } else {
                System.out.println("Entered PIN number is in-correct. Please try again");
                pinNumberInput = scanner.nextInt();
            }
            attemptNumber++;
        }

    }
}

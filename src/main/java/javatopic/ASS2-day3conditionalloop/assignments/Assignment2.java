package javatopic.day3conditionalloop.assignments;

import java.util.Scanner;
// ATM PIN VALIDATION
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pinNumber;

        int predefinedPinNumber = 1234;

        int maximumAttempt = 3;
        int attempt = 0;
        while (attempt < maximumAttempt) {
            System.out.println("Enter the pin number : ");
            pinNumber = sc.nextInt();
            if (pinNumber == predefinedPinNumber) {
                System.out.println("Access Granted");
                break;

            }
            attempt++;
            System.out.println("attempt number " + attempt);

        }
        if (attempt == maximumAttempt) {
            System.out.println("Account Locked");
        }
    }

}

package com.assignment6_part2.assignment1;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(10000.0);

        while (true) {
            try {
                System.out.print("Enter amount to withdraw (or type 'exit' to quit): ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Thank you for using ATM!");
                    break;
                }

                double amount = Double.parseDouble(input);
                atm.withdraw(amount);

            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}

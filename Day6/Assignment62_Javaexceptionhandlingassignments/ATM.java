package Assignment62_Javaexceptionhandlingassignments;

import java.util.Scanner;

public class ATM {
    private double balance;

    public ATM() {
        this.balance = 10000.0; // initial balance
    }

    public ATM(double balance) {
        this.balance = balance;
    }


    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new ArithmeticException("Insufficient funds.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        ATM atm = new ATM(); // default balance 10000
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter amount to withdraw: ");
            String input = scanner.nextLine();

            try {
                double amount = Double.parseDouble(input); // may throw NumberFormatException

                try {
                    atm.withdraw(amount); // may throw IllegalArgumentException or ArithmeticException
                    System.out.printf("Withdrawal successful. Remaining balance: %.2f%n", atm.getBalance());
                } catch (ArithmeticException ae) {
                    System.out.printf("Insufficient balance. Available: %.2f%n", atm.getBalance());
                } catch (IllegalArgumentException ie) {
                    System.out.println("Invalid amount entered.");
                }

            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a number.");
            }
        }
    }
}

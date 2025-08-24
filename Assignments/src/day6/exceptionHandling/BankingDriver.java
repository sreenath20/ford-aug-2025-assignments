package day6.exceptionHandling;

import java.util.*;

public class BankingDriver {
    public static void main(String[] args) {
        Banking bank = new Banking(10000.0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdrawal amount: ");
        try {
            String input = sc.nextLine();
            double amount = Double.parseDouble(input);

            bank.withdraw(amount);
            System.out.printf("Withdraw successful.Remaining balance: %.2f%n", bank.getBalance());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid amount.");

        } catch (ArithmeticException e) {
            System.out.println("Insufficient funds");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount entered");

        } finally {
            sc.close();
        }
    }


}

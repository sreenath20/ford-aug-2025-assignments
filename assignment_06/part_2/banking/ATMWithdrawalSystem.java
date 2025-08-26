package assignment_06.part_2.banking;
import java.util.Scanner;

public class ATMWithdrawalSystem {
    public static void main(String[] args) {
        System.out.println(" Welcome to ATM Withdrawal System! \n");

        ATM atm = new ATM(10000.0);

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- ATM Account Information ---");
        atm.displayBalance();
        System.out.println();

        while (true) {
            try {
                System.out.println("--- ATM Withdrawal ---");
                System.out.print("Enter amount to withdraw (or type 'exit' to quit): Rs.");

                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Thank you for using our ATM!");
                    break;
                }
                double amount = Double.parseDouble(input);
                atm.withdraw(amount);

            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());

            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

            System.out.println();
        }
        scanner.close();

        System.out.println("\n--- Final Account Status ---");
        atm.displayBalance();
    }
}

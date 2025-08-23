package Assignment6.bankingatmwithdrwal;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(10000.0); // Initial balance

        System.out.print("Enter amount to withdraw: ");
        try {
            String input = scanner.nextLine();
            double amount = Double.parseDouble(input);

            atm.withdraw(amount);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

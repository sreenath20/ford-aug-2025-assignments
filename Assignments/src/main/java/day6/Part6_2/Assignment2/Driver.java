package day6.Part6_2.Assignment2;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter price: ");
            String priceInput = scanner.nextLine();
            double price = Double.parseDouble(priceInput);

            System.out.print("Enter quantity: ");
            String qtyInput = scanner.nextLine();
            int quantity = Integer.parseInt(qtyInput);

            double total = checkout.calculateTotal(price, quantity);
            System.out.println("Total price: " + total);

        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered.");
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("-----Checkout process complete-----");
        }
    }
}

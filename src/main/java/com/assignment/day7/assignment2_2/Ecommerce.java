package com.assignment.day7.assignment2_2;

import java.util.Scanner;

class Checkout{

    public void calculateTotal(double price, int quantity) {

        if(price<=0 || quantity<=0) {
            throw new IllegalArgumentException("Price and Quantity should be greater than zero");
        }
        double total = price * quantity;
        System.out.println("Total Price: " + total);

    }

}

public class Ecommerce {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Checkout checkout = new Checkout();
        try{
            System.out.print("Enter the price of the item: ");
            Double price = Double.parseDouble(scanner.next());
            System.out.print("Enter the quantity of the item: ");
            Integer quantity = Integer.parseInt(scanner.next());
            checkout.calculateTotal(price, quantity);
        }
        catch (NumberFormatException e){
            System.out.println("Invalid input. Please enter numeric values for price and quantity.");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        finally {
            scanner.close();
            System.out.println("Checkout process completed.");
        }
    }


}

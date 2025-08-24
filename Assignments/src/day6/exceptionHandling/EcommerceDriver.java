package day6.exceptionHandling;

import java.util.Scanner;

public class EcommerceDriver {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter price: ");
            String priceInput= sc.nextLine();

            System.out.println("Enter quantity: ");
            String quantityInput= sc.nextLine();

            double price= Double.parseDouble(priceInput);
            int quantity= Integer.parseInt(quantityInput);
            double total= checkout.calculateTotal(price,quantity);
            System.out.println("Total is $"+total);

        }catch(NumberFormatException e){
            System.out.println("Invalid input");
        }catch(IllegalArgumentException | ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        } finally{
            System.out.println("Checkout complete");

        }
    }
}

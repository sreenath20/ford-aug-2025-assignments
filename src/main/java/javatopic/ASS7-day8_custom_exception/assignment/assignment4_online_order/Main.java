package javatopic.day8_custom_exception.assignment.assignment4_online_order;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String productName;
        int quantity;
        boolean quantityStatusValid=false;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter product name: ");
        productName = input.nextLine();
        System.out.print("Enter quantity: ");
        quantity = input.nextInt();
        OrderService order = new OrderService();
        try{
            quantityStatusValid= order.placeOrder(productName, quantity);
        }
        catch(InvalidOrderQuantityException e){

        }
        if(quantityStatusValid){
            System.out.println("Placing Order for"+productName+"(Quantity: "+quantity+" )  Order placed successfully");
        }
        else{
            System.out.println("Placing Order for"+productName+"(Quantity: "+quantity+" )  Error:Order quantity must be greater than zero");
        }

    }
}

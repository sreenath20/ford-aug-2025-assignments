package com.fullstackabi.assignment.Assign7.CustomException.Ex4;

import java.util.Scanner;

public class ECommDriver {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter product name");
        String productName = scan.nextLine();
        System.out.println("Enter quantity");
        int quantity = scan.nextInt();
        try{
            orderService.placeOrder(productName, quantity);
        }catch(InvalidOrderQuantityException e){
            System.out.println(e.getMessage());
        }



    }
}

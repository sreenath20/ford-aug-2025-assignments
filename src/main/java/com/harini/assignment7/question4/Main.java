package com.harini.assignment7.question4;

import com.harini.assignment7.question2.TicketBooking;
import com.harini.assignment7.question2.TimeLimitExceededException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrderService booking = new OrderService();
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Please enter the product name: ");
            String productName = input.nextLine();
            System.out.print("Please enter the number of quantity: ");
            int quantity = input.nextInt();

            booking.placeOrder(productName, quantity);
        }catch (InvalidOrderQuantityException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("End of the application");
        }
    }
}

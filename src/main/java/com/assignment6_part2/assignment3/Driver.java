package com.assignment6_part2.assignment3;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightBooking flightBooking = new FlightBooking();

        System.out.println("Welcome to Flight Booking System!");
        flightBooking.printSeatStatus();

        while (true) {
            try {
                System.out.print("Enter seat number to book (0-4) or 'exit' to quit: ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Thank you for using Flight Booking System!");
                    break;
                }

                int seatNumber = Integer.parseInt(input);
                flightBooking.bookSeat(seatNumber);

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number for seat selection.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }


            flightBooking.printSeatStatus();
        }

        scanner.close();
    }
}

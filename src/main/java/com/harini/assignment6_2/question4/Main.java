package com.harini.assignment6_2.question4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FlightBooking flightBooking = new FlightBooking();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter seat number (0-4): ");
            int seatNumber = Integer.parseInt(sc.nextLine());
            flightBooking.bookSeat(seatNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        flightBooking.printSeats();
    }
}

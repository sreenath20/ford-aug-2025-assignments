package com.ford.assignment6;

import java.util.Scanner;

public class FlightBooking {
    boolean[] seats = new boolean[5]; // Seats 0 to 4

    public void bookSeat(int seatNumber) {
        if (seatNumber < 0 || seatNumber >= seats.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid seat number: " + seatNumber);
        }

        if (seats[seatNumber]) {
            throw new IllegalStateException("Seat " + seatNumber + " is already booked.");
        }

        seats[seatNumber] = true;
        System.out.println("Seat " + seatNumber + " successfully booked.");
    }

    public void printSeatStatus() {
        System.out.println("Seat Status:");
        for (int i = 0; i < seats.length; i++) {
            System.out.println("Seat " + i + ": " + (seats[i] ? "Booked" : "Available"));
        }
    }

    public static void main(String[] args) {
        FlightBooking booking = new FlightBooking();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter seat number to book (0–4): ");
        String input = scanner.nextLine();

        try {
            int seatNumber = Integer.parseInt(input);
            booking.bookSeat(seatNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a numeric seat number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
        booking.printSeatStatus();
    }
}

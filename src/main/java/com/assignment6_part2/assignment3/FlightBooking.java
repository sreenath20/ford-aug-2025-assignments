package com.assignment6_part2.assignment3;

public class FlightBooking {
    private boolean[] seats = new boolean[5];

    public void bookSeat(int seatNumber) {

        if (seatNumber < 0 || seatNumber >= seats.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid seat number. Please choose seat 0-4.");
        }


        if (seats[seatNumber]) {
            throw new IllegalStateException("Seat " + seatNumber + " is already booked.");
        }


        seats[seatNumber] = true;
        System.out.println("Seat " + seatNumber + " booked successfully!");
    }

    public void printSeatStatus() {
        System.out.println("\nSeat Status:");
        for (int i = 0; i < seats.length; i++) {
            String status = seats[i] ? "BOOKED" : "AVAILABLE";
            System.out.println("Seat " + i + ": " + status);
        }
        System.out.println();
    }
}

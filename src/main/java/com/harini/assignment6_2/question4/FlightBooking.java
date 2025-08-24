package com.harini.assignment6_2.question4;



public class FlightBooking  {
    private boolean[] seats = new boolean[5];
    public void bookSeat(int seatNumber) {
        if (seatNumber < 0 || seatNumber >= seats.length) {
            throw new ArrayIndexOutOfBoundsException("Seat number out of range!");
        }
        if (seats[seatNumber]) {
            throw new IllegalStateException("Seat already booked!");
        }
        seats[seatNumber] = true;
        System.out.println("Seat " + seatNumber + " booked successfully!");
    }

    public void printSeats() {
        System.out.println("Seat Status:");
        for (int i = 0; i < seats.length; i++) {
            System.out.println("Seat " + i + ": " + (seats[i] ? "Booked" : "Available"));
        }
    }



}

package com.fullstackabi.assignment.Assign6.Exceptionhandlingaccessmodifier.part2.excephandle.Ex4TravelBooking;

public class FlightBooking {
    //; (false = available, true = booked)
    boolean[] seats = new boolean[5];

    void bookSeat(int SeatNumber) {
        // this unchecked excpetion throws error at runtime.
        if (SeatNumber < 0 || SeatNumber >= seats.length) {
            throw new ArrayIndexOutOfBoundsException("SeatNumber must be between 0 and 5");
        } else if (seats[SeatNumber]) {
            throw new IllegalStateException("Seats are not available");
        } else {
            seats[SeatNumber] = true;
            System.out.println("Seat " + SeatNumber + " is available and booked");
        }
    }
}

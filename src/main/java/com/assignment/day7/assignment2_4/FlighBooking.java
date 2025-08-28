package com.assignment.day7.assignment2_4;

public class FlighBooking {
    boolean[] seats = new boolean[5];

    public void bookSeat(int seatNumber) {
        if (seatNumber<1 || seatNumber>5) {
            throw new ArrayIndexOutOfBoundsException("Invalid seat number");
        }
        if (seats[seatNumber]==true) {
            throw new IllegalStateException("Seat number "+seatNumber+" is booked");
        }
        seats[seatNumber]=true;
        System.out.println("Seat number "+seatNumber+" is booked successfully");
    }

    public static void main(String[] args) {
        FlighBooking flighBooking = new FlighBooking();

        try{
            flighBooking.bookSeat(1);
            flighBooking.bookSeat(2);
            flighBooking.bookSeat(3);
            flighBooking.bookSeat(4);
        }
        catch(NumberFormatException | IllegalStateException e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}



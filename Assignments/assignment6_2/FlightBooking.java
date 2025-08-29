package com.assignments.assignment6_2;

public class FlightBooking {

//    false - available, true - booked
    boolean[] seats = {false,true,false,false,true};

    public void bookSeat(Integer seatNumber) throws Exception{
        if(seatNumber > seats.length){
            throw new ArrayIndexOutOfBoundsException("Booking seats out of range.Seat no : "+seatNumber);
        }
        if(seats[seatNumber-1]){
            throw new  IllegalStateException("Seat was already booked.Seet no : "+seatNumber);
        }
        seats[seatNumber-1]=true;
        System.out.println("Seat "+seatNumber+" booked successfully.");
    }
}

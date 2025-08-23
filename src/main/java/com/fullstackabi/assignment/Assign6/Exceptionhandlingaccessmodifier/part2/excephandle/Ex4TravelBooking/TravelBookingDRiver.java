package com.fullstackabi.assignment.Assign6.Exceptionhandlingaccessmodifier.part2.excephandle.Ex4TravelBooking;

import java.util.Scanner;

public class TravelBookingDRiver {

    public static void main(String[] args){
        System.out.println("Enter seat number");
        Scanner input = new Scanner(System.in);
        String seatNumber = input.nextLine();

        FlightBooking flightBooking = new FlightBooking();
        try {
            int seatNum = Integer.parseInt(seatNumber);
            flightBooking.bookSeat(seatNum);
        }catch(NumberFormatException e){
            System.out.println("Enter valid seat number - numeric value");
        }
    }
}

package com.assignment7_customexception.assignment2;

public class Driver {
    public static void main(String[] args) {
        TicketBooking ticketBooking = new TicketBooking();
        try {
            ticketBooking.bookTickets("Avengers", 7);
            System.out.println("Booking Successful");
        } catch (TicketLimitExceededException e) {
            System.out.println(e.getMessage());
        }
    }
}

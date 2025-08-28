package com.assignment.day8.assignment2;

class TicketLimitExceededException extends Exception {
    public TicketLimitExceededException(String message) {
        super(message);
    }
}

public class TicketBooking {

    public void bookTickets(String movieName, int quantity) throws TicketLimitExceededException {
        if (quantity > 6) {
            throw new TicketLimitExceededException("Cannot book more than 6 tickets at a time.");
        } else {
            System.out.println(quantity + " tickets booked for " + movieName);
        }
    }

    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();
        try {
            booking.bookTickets("Inception", 5); // Valid booking
            booking.bookTickets("Interstellar", 7); // This will throw exception
        } catch (TicketLimitExceededException e) {
            System.out.println("Booking failed: " + e.getMessage());
        }
    }

}

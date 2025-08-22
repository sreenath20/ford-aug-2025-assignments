package com.ford.assignment7;

class TicketLimitExceededException extends RuntimeException {
    public TicketLimitExceededException(String message) {
        super(message);
    }
}

class TicketBooking {
    public void bookTickets(String movieName, int quantity) {
        if (quantity > 6) {
            throw new TicketLimitExceededException("Cannot book more than 6 tickets at once.");
        }
        System.out.println("Booking " + quantity + " tickets for " + movieName + "... → Booking successful!");
    }
}

public class TicketBookingMain {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();

        try {
            booking.bookTickets("Avengers", 4);
            booking.bookTickets("Oppenheimer", 7);
        } catch (TicketLimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

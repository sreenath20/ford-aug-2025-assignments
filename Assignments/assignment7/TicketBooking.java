package com.assignments.assignment7;

public class TicketBooking {

    void bookTicket(String movieName,int quantity) throws  TicketLimitExceededException{
        System.out.print("Booking "+quantity+" Tickets for "+movieName +"-> : ");
        if(quantity >6) throw new TicketLimitExceededException("Cannot book mare than 6 Tickets at once.");
        System.out.println("Ticket Booked Successfully.");
    }
}

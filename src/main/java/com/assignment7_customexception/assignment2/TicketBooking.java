package com.assignment7_customexception.assignment2;

public class TicketBooking {

    public void bookTickets(String movieName,int quantity) throws TicketLimitExceededException{


        if (6 < quantity) {
            throw new TicketLimitExceededException(" Cannot book more than 6 tickets at once");
        }



    }
}

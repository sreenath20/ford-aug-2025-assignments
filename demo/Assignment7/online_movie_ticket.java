package com.demo.Assignment7;

public class online_movie_ticket {
    public static void main(String[] args) {
        TicketBooking ticketBooking = new TicketBooking();
        try {
            ticketBooking.bookTicket("Harry Poter", 7);
        }
    catch (InvalidPinException e){
        System.out.println(e.getMessage());}
    }
}
class TicketLimitExceededException extends Exception{
    TicketLimitExceededException(String message){
        super(message);
    }
}
class TicketBooking{
    void bookTicket(String movieName,Integer quantity)throws InvalidPinException{
        if(quantity>0 && quantity<=5){
            System.out.println("Booking "+quantity+" for "+movieName);
            System.out.println("Booking successful");
        }
        else{
            System.out.println("Booking "+quantity+" for "+movieName);
            throw new InvalidPinException("Cannot book more than 6 tickets at once");

        }

    }
}




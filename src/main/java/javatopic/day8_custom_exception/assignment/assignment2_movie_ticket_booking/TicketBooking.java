package javatopic.day8_custom_exception.assignment.assignment2_movie_ticket_booking;

public class TicketBooking {
    boolean bookTickets(String movieName,int quantity) throws TicketLimitExceededException{
        if(quantity>6){
            throw new TicketLimitExceededException();
        }
        else{
            return true;
        }
    }
}

package javatopic.day8_custom_exception.assignment.assignment2_movie_ticket_booking;
// unchecked custom exception
public class TicketLimitExceededException extends RuntimeException{
    public TicketLimitExceededException(){

    }
    public TicketLimitExceededException(String message) {
        super(message);
    }
}

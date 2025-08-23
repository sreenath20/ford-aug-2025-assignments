package Assignment7.OnlineMovieTicketBooking;

public class TicketLimitExceededException extends RuntimeException {
    public TicketLimitExceededException(String message) {
        super(message);
    }
}

package assignment_07.online_movie_ticket_booking;

class TicketLimitExceededException extends RuntimeException {
    public TicketLimitExceededException(String message) {
        super(message);
    }
    public TicketLimitExceededException() {
        super("Ticket limit exceeded");
    }
}


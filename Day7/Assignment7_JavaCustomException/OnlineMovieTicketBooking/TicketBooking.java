package OnlineMovieTicketBooking;

public class TicketBooking {
    public void bookTickets(String movieName, int quantity) {
        System.out.println("Booking " + quantity + " tickets for " + movieName + "...");
        if (quantity > 6) {
            throw new TicketLimitExceededException("Cannot book more than 6 tickets at once.");
        }
        System.out.println("Booking successful!");
    }
}


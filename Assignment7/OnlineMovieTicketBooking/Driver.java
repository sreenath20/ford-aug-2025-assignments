package Assignment7.OnlineMovieTicketBooking;

public class Driver {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();

        try {
            booking.bookTickets("Harry Potter", 4);
            booking.bookTickets("Conjuring", 7);
        } catch (TicketLimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

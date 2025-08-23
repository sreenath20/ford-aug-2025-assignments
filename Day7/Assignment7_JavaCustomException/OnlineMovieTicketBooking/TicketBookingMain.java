package OnlineMovieTicketBooking;

public class TicketBookingMain {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();

        try {
            booking.bookTickets("Avengers", 4);
        } catch (TicketLimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            booking.bookTickets("Oppenheimer", 7);
        } catch (TicketLimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


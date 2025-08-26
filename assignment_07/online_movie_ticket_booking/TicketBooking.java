package assignment_07.online_movie_ticket_booking;

class TicketBooking {
    private static final int MaxTicket_perBooking = 6;
    private static final double FinalTicketPrice = 247.50; //for simplicity
    private static final String[] AvailableMovies = {
            "Avengers: Endgame",
            "How to Train your Dragon 2",
            "Spider Man: Homecoming",
            "Final Destination",
            "Inception"
    };

    public void bookTickets(String movieName, int quantity) {
        if (!isValidMovie(movieName)) {
            throw new TicketLimitExceededException("Movie '" + movieName + "' is not available. Please choose from the available movies list.");
        }

        if (quantity > MaxTicket_perBooking) {
            throw new TicketLimitExceededException("Cannot book more than " + MaxTicket_perBooking + " tickets at once.");
        }

        if (quantity <= 0) {
            throw new TicketLimitExceededException("Number of tickets must be greater than 0.");
        }

        double totalPrice = quantity * FinalTicketPrice;

        System.out.println("Booking successful!");
        System.out.println("Movie: " + movieName);
        System.out.println("Tickets: " + quantity);
        System.out.println("Total Price: Rs." + totalPrice);
    }

    public void displayAvailableMovies() {
        System.out.println("--- Available Movies ---");
        System.out.println("1. Avengers: Endgame");
        System.out.println("2. How to Train your Dragon 2");
        System.out.println("3. Spider Man: Homecoming");
        System.out.println("4. Final Destination");
        System.out.println("5. Inception");
        System.out.println("------------------------------------");
        System.out.println("Ticket Price: Rs." + FinalTicketPrice + " each");
        System.out.println("Maximum " + MaxTicket_perBooking + " tickets per booking");
        System.out.println("------------------------------------");
    }

    private boolean isValidMovie(String enteredMovie) {
        if (enteredMovie == null || enteredMovie.trim().isEmpty()) {
            return false;
        }

        String enteredMovieLower = enteredMovie.trim().toLowerCase();

        for (int i = 0; i < AvailableMovies.length; i++) {
            if (AvailableMovies[i].toLowerCase().equals(enteredMovieLower)) {
                return true;
            }
        }
        return false;
    }
}

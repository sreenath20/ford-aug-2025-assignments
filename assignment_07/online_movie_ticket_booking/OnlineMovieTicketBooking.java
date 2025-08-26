package assignment_07.online_movie_ticket_booking;

import java.util.Scanner;

public class OnlineMovieTicketBooking {
    public static void main(String[] args) {
        System.out.println("Online Movie Ticket Booking! \n");

        TicketBooking booking = new TicketBooking();
        booking.displayAvailableMovies();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\n--- Movie Ticket Booking ---");
                System.out.print("Enter movie name (or 'exit' to quit): ");
                String movieName = scanner.nextLine();

                if (movieName.equalsIgnoreCase("exit")) {
                    System.out.println("Thank you for using Movie Ticket Booking! ");
                    break;
                }

                if (movieName.isEmpty()) {
                    System.out.println("Movie name cannot be empty. Please try again.");
                    continue;
                }

                System.out.print("Enter number of tickets (1-6): ");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                booking.bookTickets(movieName, quantity);

            } catch (TicketLimitExceededException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number for tickets.");

            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
    }
}

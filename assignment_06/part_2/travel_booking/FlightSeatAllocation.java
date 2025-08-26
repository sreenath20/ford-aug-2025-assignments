package assignment_06.part_2.travel_booking;

import java.util.Scanner;

public class FlightSeatAllocation {
    public static void main(String[] args) {
        System.out.println("Welcome to Flight Booking System!\n");

        // Create flight booking object
        FlightBooking flight = new FlightBooking();

        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);
        flight.displaySeats();

        while (true) {
            try {
                System.out.println("\n--- Seat Booking ---");
                System.out.println("Available seats: " + flight.getAvailableSeats() + "/5");

                if (flight.getAvailableSeats() == 0) {
                    System.out.println("Flight is fully booked!");
                    break;
                }

                System.out.print("Enter seat number to book (1-5) or 'exit' to quit: ");
                String input = scanner.nextLine().trim();

                // Check if user wants to exit
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Thank you for using Flight Booking System!");
                    break;
                }

                int seatNumber = Integer.parseInt(input);
                flight.bookSeat(seatNumber);

            } catch (NumberFormatException e) {
                // Handle non-numeric input
                System.out.println("Invalid input! Please enter a number between 1 and 5.");

            } catch (ArrayIndexOutOfBoundsException e) {
                // Handle invalid seat numbers
                System.out.println(e.getMessage());
                System.out.println("Please choose a seat between 1 and 5.");

            } catch (IllegalStateException e) {
                // Handle already booked seats
                System.out.println(e.getMessage());
                System.out.println("Please choose a different seat.");
            }
            flight.displaySeats();
        }

        flight.displaySeats();
        System.out.println("Total booked seats: " + (5 - flight.getAvailableSeats()) + "/5");
    }
}

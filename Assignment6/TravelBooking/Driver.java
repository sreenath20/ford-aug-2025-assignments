package Assignment6.TravelBooking;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        FlightBooking booking = new FlightBooking();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter seat number to book (0-4): ");
            String input = scanner.nextLine();
            int seatNumber = Integer.parseInt(input);
            booking.bookSeat(seatNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        } catch (ArrayIndexOutOfBoundsException | IllegalStateException e) {
            System.out.println(e.getMessage());
        } finally {
            booking.printSeats();
            scanner.close();
        }
    }

}

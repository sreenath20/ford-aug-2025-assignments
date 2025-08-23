import java.util.Scanner;

public class FlightBooking {
    private final boolean[] seats = new boolean[5];

    public void bookSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > seats.length) {
            throw new ArrayIndexOutOfBoundsException("Seat number must be between 1 and " + seats.length);
        }
        int idx = seatNumber - 1;
        if (seats[idx]) {
            throw new IllegalStateException("Seat " + seatNumber + " is already booked.");
        }
        seats[idx] = true;
    }

    public void printSeatStatus() {
        System.out.println("Seat status:");
        for (int i = 0; i < seats.length; i++) {

            System.out.printf(" Seat %d: %s%n", (i + 1), (seats[i] ? "Booked" : "Available"));
        }
    }

    public static void main(String[] args) {
        FlightBooking fb = new FlightBooking();
        fb.seats[1] = true;
        fb.seats[4] = true;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seat number to book (1-5): ");
        String input = sc.nextLine();

        try {
            int seatNum = Integer.parseInt(input);
            fb.bookSeat(seatNum);
            System.out.println("Seat " + seatNum + " successfully booked.");
        } catch (NumberFormatException nfe) {
            System.out.println("Please enter a valid numeric seat number.");
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Invalid seat number: " + aioobe.getMessage());
        } catch (IllegalStateException ise) {
            System.out.println("Booking failed: " + ise.getMessage());
        } finally {
            System.out.println();
            fb.printSeatStatus();
            sc.close();
        }
    }
}

package assignment_06.part_2.travel_booking;

import java.util.Scanner;

class FlightBooking {
    private boolean[] seats = new boolean[5];

    public void bookSeat(int seatNumber) {
        // if seat number is out of range will throw ArrayIndexOutOfBoundsException
        if (seatNumber < 1 || seatNumber > seats.length) {
            throw new ArrayIndexOutOfBoundsException("Seat number " + seatNumber + " is invalid. Valid seats: 1-" + seats.length);
        }

        int seatIndex = seatNumber - 1;
        if (seats[seatIndex] == true) {
            throw new IllegalStateException("Seat " + seatNumber + " is already booked!");
        }

        seats[seatIndex] = true;
        System.out.println("Seat " + seatNumber + " booked successfully!");
    }

    public void displaySeats() {
        System.out.println("\n--- Current Seat Status ---");
        System.out.print("Seats: ");
        for (int i = 0; i < seats.length; i++) {
            int seatNumber = i + 1;
            if (seats[i]) {
                System.out.print("[" + seatNumber + ":BOOKED] ");
            } else {
                System.out.print("[" + seatNumber + ":FREE] ");
            }
        }
        System.out.println();
    }

    public int getAvailableSeats() {
        int available = 0;
        for (int i = 0; i < seats.length; i++) {
            if (!seats[i]) {
                available++;
            }
        }
        return available;
    }

    public boolean isSeatAvailable(int seatNumber) {
        if (seatNumber < 1 || seatNumber > seats.length) {
            return false;
        }
        return !seats[seatNumber - 1];
    }
}
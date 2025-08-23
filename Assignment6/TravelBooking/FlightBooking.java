package Assignment6.TravelBooking;

public class FlightBooking {
    boolean[] seats = new boolean[5];

    public void bookSeat(int seatNumber) {
        if (seatNumber < 0 || seatNumber >= seats.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid seat number.");
        }
        if (seats[seatNumber]) {
            throw new IllegalStateException("Seat already booked.");
        }

        seats[seatNumber] = true;
        System.out.println("Seat " + seatNumber + " booked successfully.");
    }

    public void printSeats() {
        System.out.println("Seat status:");
        for (int i = 0; i < seats.length; i++) {
            System.out.println("Seat " + i + ": " + (seats[i] ? "Booked" : "Available"));
        }
    }
}

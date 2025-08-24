package assignment6.ExceptionHandling.assignmentD7ExceptnHandling4;

public class FlightBooking {
    boolean[] seats= new boolean[5];
    
    public void bookSeat(int seatNumber){
        if (seatNumber > seats.length){
            throw new ArrayIndexOutOfBoundsException("Accessing seat than the available limit");
        } else if (seats[seatNumber] == true){
            throw new IllegalStateException("Seat number " + seatNumber + " is already booked");
        }
        else  {
            seats[seatNumber] = true;
            System.out.println("Seat number " + seatNumber + " booked successfully");
        }

    }
}

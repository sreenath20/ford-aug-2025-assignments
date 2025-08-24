package assignment6.ExceptionHandling.assignmentD7ExceptnHandling4;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        FlightBooking flightbooking = new FlightBooking();
        Scanner input = new Scanner(System.in);
        int seatNumber = input.nextInt();
        try{
            flightbooking.bookSeat(seatNumber);
        }
        catch(NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(IllegalStateException e){
            System.out.println(e.getMessage());
        }

    }
}

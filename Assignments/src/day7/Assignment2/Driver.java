package day7.Assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();
        Scanner input = new Scanner(System.in);


        try{
            System.out.print("Please enter the movie name: ");
            String movieName = input.nextLine();
            System.out.print("Please enter the number of tickets: ");
            int movieDuration = input.nextInt();
            booking.bookTicket(movieName, movieDuration);
        }catch (TimeLimitExceededException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Thank you for returning the ticket");
        }
    }
}

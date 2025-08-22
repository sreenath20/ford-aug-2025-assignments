package javatopic.day8_custom_exception.assignment.assignment2_movie_ticket_booking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String movieName;
        int quantity;
        boolean bookingStatus=false;
        System.out.print("Enter Movie Name : ");
        movieName = input.nextLine();
        System.out.print("Enter Quality : ");
        quantity = input.nextInt();
        TicketBooking ticketBooking = new TicketBooking();
        try{
            bookingStatus=ticketBooking.bookTickets(movieName,quantity);
        }
        catch(TicketLimitExceededException e){
            //System.out.println(e.getMessage());
        }
        if(bookingStatus){
            System.out.println(" Booking "+quantity+" tickets for "+movieName+ " is Successful");

        }
        else{
            System.out.println(" Booking "+quantity+" tickets for "+movieName+ " Error :cannot book more than 6 tickets");
        }

    }
}

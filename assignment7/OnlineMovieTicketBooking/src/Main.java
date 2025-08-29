import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TicketBooking ticketBooking = new TicketBooking();
        Scanner input = new Scanner(System.in);
        System.out.println("Book your movie tickets here  ");
        System.out.print("Name of the movie: ");
        String movieName = input.nextLine();

        System.out.println("Please enter the number of tickets you would like to book: ");
        int numberOfTickets = input.nextInt();
        try{
            ticketBooking.bookTickets(movieName, numberOfTickets);
        }
        catch (TicketLimitExceededException e){
            System.out.println("Error :"+e.getMessage());
        }
    }
}
package day7.Assignment2;

public class TicketBooking {
    public void bookTicket(String name,int quantity) throws TimeLimitExceededException{
        if(quantity>6){
            throw new TimeLimitExceededException("Cannot book more than 6 tickets at once");
        }
        else{
            System.out.println("Booking Successful");
        }
    }
}

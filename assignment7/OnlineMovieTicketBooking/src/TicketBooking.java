public class TicketBooking {
    public void bookTickets(String movieName,int quantity)
    {
        if(quantity > 6)
        {
            throw new TicketLimitExceededException("Cannot book more than 6 tickets at once");
        }
        else{
            System.out.println("Booking " + quantity + " tickets for " + movieName + "... → Booking successful!");
        }
    }
}

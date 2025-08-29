import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        FlightBooking booking=new FlightBooking();

        System.out.println("Flight ticket booking System: ");
        System.out.println("Enter the seat number between 0 and 4(inclusive):");
        System.out.println("to exit application enter exit or quit: ");
        while(true){
            String input=sc.nextLine();
            if(input.equals("quit") || input.equals("exit")){
                System.out.println(input+"ing application Thank you!");
                break;
            }
            if(booking.checkSeats())
            {
                System.out.println("All seats are booked");
                break;
            }


            try{
                int seatNumber=Integer.parseInt(input);
                booking.bookSeat(seatNumber);
            }
            catch (NumberFormatException e){
                System.out.println("Please enter only number.");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Please enter a number between 0 and 4(inclusive):");
            }
            catch (IllegalStateException e){
                System.out.println("Error :"+e.getMessage());
            }
        }


    }
}
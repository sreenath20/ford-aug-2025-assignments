public class FlightBooking {
    boolean [] seats=new boolean[5];
    private int noOfSeats=5;



    public void bookSeat(int seatNumber){

        if(seatNumber < 0 || seatNumber > 4){
            throw new ArrayIndexOutOfBoundsException("seat number must be between 0 and 4.");
        }
        else if(seats[seatNumber]){
            throw new IllegalStateException("seat number "+seatNumber+" is already booked.");
        }
        else{


            System.out.println("Seat number "+ seatNumber+" Booked Successfully");
            seats[seatNumber]=true;
            for(boolean b:seats){
                System.out.println(b);
            }
            noOfSeats--;
        }




    }

    public boolean checkSeats(){
        if(noOfSeats ==0)
        {

            return true;
        }
        return false;
    }


}

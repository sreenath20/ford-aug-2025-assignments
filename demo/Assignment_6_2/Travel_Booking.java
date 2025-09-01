package com.demo.Assignment_6_2;

import java.util.Scanner;

public class Travel_Booking {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int seat=sc.nextInt();
        FlightBooking flightBooking=new FlightBooking();
        try{
            flightBooking.bookSeat(seat);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());

        }
        catch(IllegalStateException e){
            System.out.println(e.getMessage());
        }
        flightBooking.displaySeats();
    }
}
class FlightBooking{
    boolean[] Seats= new boolean[5];
    public void bookSeat(int seatNumber)throws ArrayIndexOutOfBoundsException,IllegalStateException{
        if(seatNumber<0 || seatNumber>5){
            throw new ArrayIndexOutOfBoundsException("Illegal input value for booking seats");
        }
        else if(Seats[seatNumber]==true){
            throw new IllegalStateException("Seat is already booked");
        }
        else{
            Seats[seatNumber]=true;
            System.out.println("Seat booked successfully");
        }

    }
    public void displaySeats(){
        for(int i=0;i<5;i++){
            if(Seats[i]==true){
                System.out.println("Seat "+i+" booked");
            }
        }
    }
}

package com.assignments.assignment6_2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        try {
            ATM atm = new ATM(500.0);
            System.out.print("Enter amount to withdraw :");
            Double amount= Double.valueOf(sc.next());
            atm.withdraw(amount);


            Checkout checkout=new Checkout();
            System.out.print("Enter price and quantity : ");
            Double price  = Double.valueOf(sc.next());
            Integer quantity = Integer.valueOf(sc.next());
            checkout.calculateTotal(price,quantity);

            CustomerFileReader customerFileReader =new CustomerFileReader();
            customerFileReader.readCustomerFile("C:\\Users\\RANBAZH3\\My Space\\JavaFullStackTraining\\Java\\Training\\src\\main\\java\\com\\assignments\\assignment6_2\\customers.txt");

            FlightBooking flightBooking=new FlightBooking();
            System.out.print("Enter seat number: ");
            int seatNumber=Integer.valueOf(sc.next());
            flightBooking.bookSeat(seatNumber);

        }
        catch (ArithmeticException ae){
            System.out.println("Arithmetic Exception :"+ae.getMessage());
        }
        catch (NumberFormatException nfe){
            System.out.println("NumberFormatException :"+nfe.getMessage());
        }
        catch (IllegalArgumentException iae){
            System.out.println("IllegalAccessException :"+iae.getMessage());
        }
        catch (FileNotFoundException fne){
            System.out.println("FileNotFoundException :"+fne.getMessage());
        }
        catch (IllegalStateException ise){
            System.out.println("IllegalStateException :"+ise.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("ArrayIndexOutOfBoundsException :"+ae.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception :"+e.getMessage());
        }


    }
}

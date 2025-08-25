package com.demo.Assignment7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ATM_Pin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=0;
        ATM atm = new ATM();
        while(i<=2){
            System.out.println("Please enter the pin: ");
            int password=sc.nextInt();
            try{
                atm.validatePin(password);
                break;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            i++;
        }
    }


}
class InvalidPinException extends Exception{
    InvalidPinException(String message){
        super(message);
    }
}
class ATM{
    final int pin=1234;
    void validatePin(int password) throws InvalidPinException{
        if(password==pin){
            System.out.println("Pin is valid");
        }
        else{
            throw new InvalidPinException("Invalid Pin");
        }
    }
}

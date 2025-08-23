package com.fullstackabi.assignment.Assign6.Exceptionhandlingaccessmodifier.part2.excephandle.Ex1Banking;

import java.util.Scanner;

public class BankingATMDriver {

    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);

        System.out.println("Enter the amount for withdrawal");
        double input = scan.nextDouble();

        ATM atm = new ATM();
        try{
           atm.withDraw(input);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}

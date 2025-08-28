package com.assignment.day7.assignment2_1;

import java.util.Scanner;

public class Atm {
    Double balance = 1000.00;

    public void withdraw(Double amount){
        if(amount>balance){
            throw new ArithmeticException("Insufficient Balance");
        }
        if(amount<=0){
            throw new IllegalArgumentException("Invalid Amount");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter amount to withdraw:");
        Double amount=sc.nextDouble();
        Atm atm=new Atm();
        try{
            atm.withdraw(amount);
            System.out.println("Please collect your cash "+amount);
            System.out.println("Balance is "+(atm.balance-amount));
        }catch(ArithmeticException | IllegalArgumentException e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }

    }

}

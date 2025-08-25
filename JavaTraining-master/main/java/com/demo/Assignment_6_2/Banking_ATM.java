package com.demo.Assignment_6_2;


import java.util.Scanner;

public class Banking_ATM {
    public static void main(String[] args) throws Exception {
        ATM atm=new ATM();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw");
        double amount=sc.nextDouble();
        try {
            if (atm.withdraw(amount)){
                System.out.println("You have successfully deposited "+amount);
            }
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());

        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());

        }
    }

}
class ATM {
    public double balance = 10000;

    public boolean withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new ArithmeticException("Insufficient Balance");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid Amount");
        }
        return true;
    }


}


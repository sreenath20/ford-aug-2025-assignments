package com.harini.assignment6_2.Question1;

public class ATM {
    private double balance;
    public ATM(){
        this.balance = 2000.0;
    }
    public void withdraw(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Amount must be greater than 0.");
        } else if (amount>balance) {
            throw new ArithmeticException("Insufficient Balance.");
        }
        else{
            balance-=amount;
            System.out.println("Withdraw Successful.");
        }
    }
}

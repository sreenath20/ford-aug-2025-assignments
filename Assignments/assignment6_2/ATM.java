package com.assignments.assignment6_2;

public class ATM {
    private Double balance;

    public ATM(Double balance) {
        this.balance = balance;
    }
    public Double getBalance() {
        return balance;
    }
    public void withdraw(Double amount) throws Exception{
        if(amount > balance) throw new ArithmeticException("Insufficient Balance Available : "+balance);
        if(amount <= 0) throw new IllegalArgumentException("Invalid Amount entered: "+amount);
        balance = balance - amount;
        System.out.println("Withdraw Successful..!");
    }
}

package com.harini.day4;

public class UserAccount {
    private String userName;
    private int accountNumber;
    private double balance;
    public UserAccount(String userName, int userId) {
        this.userName = userName;
        this.accountNumber = userId;
        this.balance = 50000;
    }
    public void addFund(double amount){
        if(amount<0){
            System.out.println("Enter a valid amount");
        }
        else {
            balance += amount;
            System.out.println("Amount is deposited");
            System.out.println("The new balance is " + balance);
        }
    }
    public void withdrawFund(double amount){
        if(amount>balance|| amount<0){
            System.out.println("Insufficient balance");
        }
        else{
            balance-=amount;
            System.out.println("Amount is withdrawn");
            System.out.println("The new balance is " + balance);

        }
    }
    public double getBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return "----------------UserAccount Details-------------------\n" +
                "userName = " + userName + "\n" +
                "accountNumber = " + accountNumber + '\n' +
                "balance = " + balance ;
    }


}

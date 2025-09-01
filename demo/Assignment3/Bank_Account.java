package com.demo.Assignment3;

//import com.demo.currentAccount;

//------------------------Assignment 2-----------------------
public class Bank_Account {
    private String account_number;
    private String account_name;
    private int balance;
    public Bank_Account(String account_number, String account_name, int balance) {
        this.account_number = account_number;
        this.account_name = account_name;
        this.balance = balance;
    }
    public String getAccount_number() {
        return account_number;
    }
    public void setAccount_number(String account_number) {
        this.account_number = account_number;

    }

    public String getAccount_name() {
        return account_name;
    }
    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public static void main(String[] args){
        Saving_Account s1= new Saving_Account("Abinash","ET",1002,50000,3.5);
        s1.inters_to_calculate();
        currentAccount c1= new currentAccount("kishore","ET",1023,60000,300000);
        c1.inters_to_calculate();
    }
}

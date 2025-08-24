package assignment4.assignment4InheritanceOnlineBanking;

import java.util.Scanner;

public class BankAccount {
    private Integer accountNumber;
    private Double balance;
    private String ownerName;
    private Double depositAmount;
    private Double withdrawalAmount;

    Scanner scanner = new Scanner(System.in);



    public BankAccount() {
    }

    public BankAccount(Integer accountNumber, Double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit() {
        System.out.println("Enter the amount to be deposited");
        depositAmount = scanner.nextDouble();
        balance = balance + depositAmount;
        System.out.println("The depositAmount is " + depositAmount + "and the available balance is :" + balance);
    }

    public void withdrawal() {
        System.out.println("Enter the amount to be withdrawn");
        withdrawalAmount = scanner.nextDouble();
        if (withdrawalAmount > balance) {
            System.out.println("Insufficient funds");
        }
        else {
            balance = balance - withdrawalAmount;
            System.out.println("The withdrawal amount is " + withdrawalAmount + "and the available balance is :" + balance);
        }

    }
}

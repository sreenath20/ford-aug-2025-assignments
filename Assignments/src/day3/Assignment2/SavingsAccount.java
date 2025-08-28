package day3.Assignment2;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, String ownerName, double interestRate) {
        super(accountNumber, balance, ownerName);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = (getBalance() * interestRate) / 100;
        System.out.println("Interest calculated: " + interest);
        deposit(interest);
    }
}

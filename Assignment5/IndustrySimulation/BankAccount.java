package Assignment5.IndustrySimulation;


public class BankAccount {
    protected int accountNumber;
    protected double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double calculateInterest() {
        return 0.0;
    }
}


package day3.Assignment2;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;


    public CurrentAccount(String accountNumber, double balance, String ownerName, double overdraftLimit) {
        super(accountNumber, balance, ownerName);
        this.overdraftLimit = overdraftLimit;
    }


    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + overdraftLimit) >= amount) {
            double newBalance = getBalance() - amount;
            super.deposit(-amount);
            System.out.println("Withdrawn: " + amount + " | New Balance: " + getBalance());
        } else {
            System.out.println("Overdraft limit exceeded or invalid amount.");
        }

    }
}

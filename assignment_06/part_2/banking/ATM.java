package assignment_06.part_2.banking;

public class ATM {
    private double balance;

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount entered.");
        }

        if (amount > balance) {
            throw new ArithmeticException("Insufficient balance. Available: $" + balance);
        }

        balance = balance - amount;
        System.out.println("Withdrawal successful!");
        System.out.println("Amount withdrawn: Rs." + amount);
        System.out.println("Remaining balance: Rs." + balance);
    }

    public void displayBalance() {
        System.out.println("Current balance: Rs." + balance);
    }
}

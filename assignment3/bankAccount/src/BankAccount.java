public class BankAccount {
    private int accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(int accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;

    }
    public BankAccount() {

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited $" + amount);
        System.out.println("Balance $" + balance);
    }
    public void withdraw(double amount) {
        if(balance >= amount) {
            this.balance -= amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
        System.out.println("Withdrawal $" + amount);
        System.out.println("Balance $" + balance);
    }

}

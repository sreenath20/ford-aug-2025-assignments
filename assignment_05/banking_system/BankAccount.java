package assignment_05.banking_system;

// Dynamic Polymorphism - (Method Overriding)
class BankAccount implements SecurityCheck {
    protected int accountNumber;
    protected String accountHolder;
    protected double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to be overridden by subclasses
    public double calculateInterest() {
        return balance * 0.02;  // Base interest: 2%
    }

    @Override
    public boolean verifyUser(String username, String password) {
        return username.equals("user") && password.equals("pass");
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs." + balance);
    }
}
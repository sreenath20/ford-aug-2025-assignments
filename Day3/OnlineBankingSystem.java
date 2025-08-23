class BankAccount {
    private String accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public String getOwnerName() { return ownerName; }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        balance += amount;
        System.out.println("Deposited " + amount + " new balance: " + balance);
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " new balance: " + balance);
            return true;
        }
        System.out.println("Insufficient funds for withdrawal of " + amount);
        return false;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate; // e.g., 0.03 for 3%

    public SavingsAccount(String accountNumber, String ownerName, double initialBalance, double interestRate) {
        super(accountNumber, ownerName, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println("Applied interest: " + interest);
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String ownerName, double initialBalance, double overdraftLimit) {
        super(accountNumber, ownerName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        if (getBalance() + overdraftLimit >= amount) {
        }
        return false;
    }
}

class BankAccount2 {
    private String accountNumber;
    protected double balance;
    private String ownerName;

    public BankAccount2(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }
    public double getBalance() { return balance; }
    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        balance += amount;
    }
    public boolean withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        if (balance >= amount) { balance -= amount; return true; }
        return false;
    }
}

class CurrentAccount2 extends BankAccount2 {
    private double overdraftLimit;
    public CurrentAccount2(String acc, String owner, double init, double overdraft) {
        super(acc, owner, init);
        this.overdraftLimit = overdraft;
    }
    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

public class OnlineBankingSystem {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("SA-001", "Charlie", 1000.0, 0.04);
        s.deposit(500);
        s.applyInterest(); // calculates and deposits interest

        CurrentAccount2 c = new CurrentAccount2("CA-001", "Dana", 200.0, 500.0);
        System.out.println("Withdraw 600 allowed? " + c.withdraw(600)); // uses overdraft
        System.out.println("Balance after withdrawal: " + c.getBalance());
    }
}


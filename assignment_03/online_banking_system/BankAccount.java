package assignment_03.online_banking_system;

class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountUserName;

    public BankAccount(String accountNumber, String name, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountUserName = name;
        this.balance = initialBalance;
        System.out.println("Bank account created for " + name);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountUserName() {
        return accountUserName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountUserName(String accountUserName) {
        this.accountUserName = accountUserName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New balance: " + balance);
        }
        else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New balance: " + balance);
        }
        else if(amount >=0){
            System.out.println("Invalid Withdrawal Amount!");
        }
        else{
            System.out.println("Insufficient Balance!");
        }
    }

    public void displayAccountInfo() {
        System.out.println("--- Account Information ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountUserName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String name, double initialBalance, double interestRate) {
        super(accountNumber, name, initialBalance);
        this.interestRate = interestRate;
        System.out.println("Savings account created with " + interestRate + "% interest rate");
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.println("Interest amount: " + interest);
    }

    public void displaySavingsInfo() {
        displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Account Type: Savings Account");
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String name, double initialBalance, double overdraftLimit) {
        super(accountNumber, name, initialBalance);
        this.overdraftLimit = overdraftLimit;
        System.out.println("Current account created with overdraft limit: " + overdraftLimit);
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= (getBalance() + overdraftLimit)) {
            double newBalance = getBalance() - amount;
            deposit(-amount);
            System.out.println("Withdrawn: " + amount);
            if (newBalance < 0) {
                System.out.println("Account is overdrawn by: $" + Math.abs(newBalance));
            }
        }
        else {
            System.out.println("Withdrawal exceeds overdraft limit!");
        }
    }

    public void displayCurrentInfo() {
        displayAccountInfo();
        System.out.println("Overdraft Limit: " + overdraftLimit);
        System.out.println("Current Credit: " + (getBalance() + overdraftLimit));
        System.out.println("Account Type: Current Account");
    }
}

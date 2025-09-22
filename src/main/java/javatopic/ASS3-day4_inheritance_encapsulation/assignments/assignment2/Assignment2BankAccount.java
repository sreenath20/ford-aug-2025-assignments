package javatopic.day4_inheritance_encapsulation.assignments.assignment2;

public class Assignment2BankAccount {
    private Integer accountNumber;
    private Double balance;
    private String ownerName;

    public Assignment2BankAccount(Integer accountNumber, Double balance, String ownerName) {
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

    // methods
    public void deposit(Double balance) {
        this.balance += balance;
        System.out.println("Deposited "+balance);
    }
    public void withdraw(Double balance) {
        this.balance -= balance;
        System.out.println("Withdrawn "+balance);

    }
    public void display() {
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}

package com.assignment3_encapsulation.assignment2;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;
    private double totalwithdraw=0;
    public CurrentAccount(int accountNumber, Double balance, String accountHolderName, double overdraftLimit) {
        super(accountNumber, balance, accountHolderName);
        this.overdraftLimit = overdraftLimit;
    }

     public double getOverdraftLimit() {
          return overdraftLimit;
     }

     public void setOverdraftLimit(double overdraftLimit) {
          this.overdraftLimit = overdraftLimit;
     }
     public void withdraw(double amount) {
            if(amount <= 0) {
                System.out.println("Amount can't be negative or zero");
                return;
            }

            if( overdraftLimit <= (totalwithdraw+amount)) {
                System.out.println("Withdrawal exceeds overdraft limit");
                return;
            }
            setBalance(getBalance() - amount);
            totalwithdraw += amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + getBalance());

     }
     public String displaydetails() {
            System.out.println("CurrentAccount{" +
                    "Account Number=" + getAccountNumber() +
                    ", Balance=" + getBalance() +
                    ", Account Holder Name='" + getAccountHolderName() + '\'' +
                    ", Overdraft Limit=" + overdraftLimit +
                    ", Total Withdrawn=" + totalwithdraw +
                    '}');
            return "DONE";
     }
}

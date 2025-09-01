package com.demo.Assignment5;

public class BankingSystem {
    public static void main(String[] args) {
        TransactionProcessor transactionProcessor = new TransactionProcessor();
        transactionProcessor.process(12345,500.3);
        transactionProcessor.process(12356,123456,400.2);
        SavingAccount savingAccount = new SavingAccount(250);
        savingAccount.calculateInterest();
        CurrentAccount currentAccount = new CurrentAccount(450);
        currentAccount.calculateInterest();

        SecurityCheck.logAttempt("Ak");
     
        security Security= new security();
        Security.verifyUser("Ab","Ab");
        Security.showSecurityStatus();
    }
}
class TransactionProcessor{
    void process(int accountNumber,double amount){
        System.out.println("Your account number: " + accountNumber+"amount is: "+amount);
    }
    void process(int fromAccount,int toAccount,double amount){
        System.out.println("Your account number: " + fromAccount+"amount is: "+amount+"to account is: "+toAccount);
    }

}
abstract class  BankAccount{
    abstract void calculateInterest();
}
class SavingAccount extends BankAccount{
    int balance;
    SavingAccount(int amount){
        balance=amount;
    }
    void calculateInterest(){
        System.out.println("here is the interest rate"+balance+0.25);
    }


}
class CurrentAccount extends BankAccount{
    int balance;
        CurrentAccount(int amount){
            balance=amount;
        }
        void calculateInterest(){
            System.out.println("here is the interest rate"+balance*0.2);
        }
}
interface SecurityCheck{
    static void logAttempt(String user){
        System.out.println("your account name is "+user+" correct or wrong");
    }
    default void showSecurityStatus(){
        System.out.println("secure connection established");
    }
    public abstract void verifyUser(String username,String password);
}
class security implements SecurityCheck{
    public void verifyUser(String username,String password){
            if(username.equals(password)){
                System.out.println("you cannot create a password like this");
            }
    }
}


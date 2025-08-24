package assignment4.assignment4InheritanceOnlineBanking;

public class SavingsAccount extends BankAccount {
       Double interestValue;

    //Double annualInterestRate;

//    public SavingsAccount(Integer accountNumber, Double balance, String ownerName, Double annualInterestRate) {
//        super(accountNumber, balance, ownerName);
//      //  this.annualInterestRate = annualInterestRate;
//    }


    public SavingsAccount(Integer accountNumber, Double balance, String ownerName) {
        super(accountNumber, balance, ownerName);
    }

    public void interestCalculation(Double annualInterestRate){
        System.out.println("The available balance before interest value addition : " +super.getBalance());
        interestValue = super.getBalance() * (annualInterestRate/100);
        super.setBalance((super.getBalance() + interestValue));
       System.out.println("The available balance after interest value is : " + super.getBalance());
    }







}

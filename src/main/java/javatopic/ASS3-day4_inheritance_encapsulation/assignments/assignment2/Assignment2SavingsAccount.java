package javatopic.day4_inheritance_encapsulation.assignments.assignment2;

public class Assignment2SavingsAccount extends Assignment2BankAccount {
    Double interestRate=10.0;

    public Assignment2SavingsAccount(Integer accountNumber, Double balance, String ownerName, Double interestRate) {
        super(accountNumber, balance, ownerName);
        this.interestRate = interestRate;
    }

    public void calculateInterest(Double interestRate,Double balance) {
        System.out.println("Interest rate:"+((interestRate/100)*balance));

    }
}

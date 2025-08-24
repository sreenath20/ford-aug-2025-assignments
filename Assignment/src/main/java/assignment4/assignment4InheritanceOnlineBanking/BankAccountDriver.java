package assignment4.assignment4InheritanceOnlineBanking;

public class BankAccountDriver {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(123457,7800.75,"Sathya");

        bankAccount.deposit();
        bankAccount.withdrawal();

        SavingsAccount savingsAccount = new SavingsAccount(899076,5400.54,"Shri");
        savingsAccount.interestCalculation(2.5);

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.display();

    }
}

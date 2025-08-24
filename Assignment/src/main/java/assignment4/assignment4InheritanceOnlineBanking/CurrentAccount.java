package assignment4.assignment4InheritanceOnlineBanking;

public class CurrentAccount extends BankAccount {
    Double overDraftLimit = 2000.05;

    public void display()
    {
        System.out.println("The overdraft Limit is : " + overDraftLimit);

    }

}

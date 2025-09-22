package javatopic.day6polymorphism.assignmnent.assignment6;

public class CurrentAccount extends BankAccount {
    @Override
    void calculateInterest(){
       System.out.println("Current Account Interest");
    }
}

package javatopic.day6polymorphism.assignmnent.assignment6;

public class SavingsAccount extends BankAccount{
    @Override
    void calculateInterest() {
        System.out.println("Saving Account Interest");
    }
}

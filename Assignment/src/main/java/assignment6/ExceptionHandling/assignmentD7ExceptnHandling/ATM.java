package assignment6.ExceptionHandling.assignmentD7ExceptnHandling;

public class ATM {

    double balance;

    public void Withdraw(double amount) throws ArithmeticExceptions, IllegalArgumentException {
        if (amount > balance) {
            throw new ArithmeticExceptions("Requested amount greater than available balance " +balance);
        } else if (amount <= 0) {
            throw new IllegalArgumentException("Please enter a valid amount greater than zero");
        }
        System.out.println("Current balance available " + (balance-amount));
    }
}

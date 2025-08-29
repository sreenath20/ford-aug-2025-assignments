public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber,double balance,String ownerName,double interestRate) {
        super(accountNumber,balance,ownerName);
        this.interestRate = interestRate;
    }

    public SavingsAccount() {

    }

    public double calculateInterestRate() {
        return getBalance()*interestRate;
    }

    public void displayInterest() {
        double interest = calculateInterestRate();
        deposit(interest);
        System.out.println("Your interest is applied : "+interest);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

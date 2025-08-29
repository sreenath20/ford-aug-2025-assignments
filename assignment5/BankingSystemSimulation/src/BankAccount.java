abstract public class BankAccount implements SecurityCheck {
    protected int accountNumber;
    protected double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

   abstract void calculateInterest();
}

class SavingsAccount extends BankAccount{

    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Savings interest is $" + interest);
        System.out.println("Savings account balance is $" + balance);

    }

    @Override
    public void showSecurityStatus() {
        super.showSecurityStatus();
    }

    @Override
    public Boolean verifyUser(String userName, String password) {
        return userName.equals("admin") && password.equals("123456");
    }
}

class CurrentAccount extends BankAccount{
    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void calculateInterest(){
        System.out.println("Current account will not earn interest");
       System.out.println("Current account balance is $" + balance);

    }

    @Override
    public void showSecurityStatus() {
        super.showSecurityStatus();
    }

    @Override
    public Boolean verifyUser(String userName, String password) {
        return userName.equals("admin") && password.equals("12345");
    }
}

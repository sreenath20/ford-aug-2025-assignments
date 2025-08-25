package assignment_05.banking_system;

class CurrentAccount extends BankAccount {

    public CurrentAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.01;  // Current account interest: 1%
    }

    public void displayCurrentInfo() {
        System.out.println("=== Current Account ===");
        displayAccountInfo();
        System.out.println("Interest Rate: 1%");
        System.out.println("Interest Amount: Rs." + calculateInterest());
    }
}
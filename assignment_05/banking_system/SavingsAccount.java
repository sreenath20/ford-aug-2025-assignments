package assignment_05.banking_system;

class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.05;  // Savings interest: 5%
    }

    public void displaySavingsInfo() {
        System.out.println("=== Savings Account ===");
        displayAccountInfo();
        System.out.println("Interest Rate: 5%");
        System.out.println("Interest Amount: Rs." + calculateInterest());
    }
}
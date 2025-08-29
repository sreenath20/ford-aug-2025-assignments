public class BankAccount {
    private static double interestRate = 2.5;

    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println();
    }

    public static void updateInterestRate(double newInterestRate) {
        interestRate = newInterestRate;
    }

    public static void displayInterestRate() {
        System.out.println("Current Interest Rate is " + interestRate + "%");
    }

}

package Assignment61_Javaaccessmodifiersstaticassignments;

public class BankAccount {
    // Static field shared by all accounts (annual interest rate in percent)
    private static double interestRate = 3.0; // default: 3.0%

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Static method to update the interest rate for all accounts
    public static void updateInterestRate(double newRatePercent) {
        if (newRatePercent < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative.");
        }
        interestRate = newRatePercent;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    // calculate annual interest
    public double calculateAnnualInterestAmount() {
        return balance * (interestRate / 100.0);
    }

    // Optional: apply the annual interest to the balance
    public void applyAnnualInterest() {
        balance += calculateAnnualInterestAmount();
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("Account[%s] Balance: %.2f, CurrentRate: %.2f%%",
                accountNumber, balance, interestRate);
    }


    public static void main(String[] args) {
        System.out.printf("Interest rate (before creating accounts): %.2f%%%n", BankAccount.getInterestRate());


        BankAccount acct1 = new BankAccount("A1001", 1_000.00);
        BankAccount acct2 = new BankAccount("A1002", 5_000.00);
        BankAccount acct3 = new BankAccount("A1003", 12_500.50);


        System.out.println("\n--- Before interest rate change ---");
        System.out.println(acct1);
        System.out.printf("Annual interest for %s: %.2f%n", acct1.getAccountNumber(), acct1.calculateAnnualInterestAmount());

        System.out.println(acct2);
        System.out.printf("Annual interest for %s: %.2f%n", acct2.getAccountNumber(), acct2.calculateAnnualInterestAmount());

        System.out.println(acct3);
        System.out.printf("Annual interest for %s: %.2f%n", acct3.getAccountNumber(), acct3.calculateAnnualInterestAmount());

        // Update interest rate via static method (affects all accounts)
        System.out.println("\nUpdating interest rate to 4.5% using BankAccount.updateInterestRate(4.5)...");
        BankAccount.updateInterestRate(4.5);

        // Show new rate is reflected across all accounts
        System.out.println("\n--- After interest rate change ---");
        System.out.printf("Interest rate (queried from class): %.2f%%%n", BankAccount.getInterestRate());

        System.out.println(acct1);
        System.out.printf("Annual interest for %s (new rate): %.2f%n", acct1.getAccountNumber(), acct1.calculateAnnualInterestAmount());

        System.out.println(acct2);
        System.out.printf("Annual interest for %s (new rate): %.2f%n", acct2.getAccountNumber(), acct2.calculateAnnualInterestAmount());

        System.out.println(acct3);
        System.out.printf("Annual interest for %s (new rate): %.2f%n", acct3.getAccountNumber(), acct3.calculateAnnualInterestAmount());


        System.out.println("\nCalling static method or reading static value does NOT require an object:");
        System.out.printf("BankAccount.getInterestRate() = %.2f%%%n", BankAccount.getInterestRate());

        // (Optional) Apply interest to each account and show balances after applying
        acct1.applyAnnualInterest();
        acct2.applyAnnualInterest();
        acct3.applyAnnualInterest();

        System.out.println("\n--- Balances after applying one year of interest ---");
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);
    }
}


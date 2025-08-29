public class Main {
    public static void main(String[] args) {
        // SavingsAccount demo
        SavingsAccount savings = new SavingsAccount(5432, 1000, "Reddy", 0.1);
        System.out.println("Savings Account Initial Balance: $" + savings.getBalance());
        savings.displayInterest();
        System.out.println("Savings Account Final Balance: $" + savings.getBalance());

        // CurrentAccount demo
        CurrentAccount current = new CurrentAccount(1234, 500, "Sita", 200);
        System.out.println("\nCurrent Account Initial Balance: $" + current.getBalance());
        current.withdraw(600); // Within overdraft
        current.withdraw(200); // Should exceed overdraft
        current.getOverdraftLimit();
    }
}

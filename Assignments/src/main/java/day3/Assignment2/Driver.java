package day3.Assignment2;

public class Driver {
    public static void main(String[] args) {
        // Savings account
        SavingsAccount sa = new SavingsAccount("SA123", 5000.0, "A", 5.0);
        sa.deposit(2000);
        sa.calculateInterest();
        sa.withdraw(1000);

        System.out.println();

        // Current account
        CurrentAccount ca = new CurrentAccount("CA456", 3000.0, "B", 2000.0);
        ca.withdraw(4000);
        ca.withdraw(1500);
    }
}

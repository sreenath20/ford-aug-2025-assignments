package day5.Assignment6;


public class Driver {
    public static void main(String[] args) {
        // Static Polymorphism
        TransactionProcessor tp = new TransactionProcessor();
        tp.process(101, 500.0);
        tp.process(101, 202, 100.0);

        System.out.println();

        // Dynamic Polymorphism
        BankAccount sa = new SavingsAccount(201, 10000.0);
        BankAccount ca = new CurrentAccount(202, 20000.0);
        System.out.println("Savings Interest: $" + sa.calculateInterest());
        System.out.println("Current Interest: $" + ca.calculateInterest());

        System.out.println();

        // Interface Static + Default Methods
        SecurityCheck.logAttempt("admin");
        LoginVerifier lv = new LoginVerifier();

        if (lv.verifyUser("admin", "pass123")) {
            lv.showSecurityStatus();
        } else {
            System.out.println("Access denied");
        }
    }
    }


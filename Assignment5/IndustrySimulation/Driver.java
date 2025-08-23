package Assignment5.IndustrySimulation;



public class Driver {
    public static void main(String[] args) {
        // Static Polymorphism
        TransactionProcess tp = new TransactionProcess();
        tp.process(1001, 5000.0);
        tp.process(1001, 1002, 1500.0);

        System.out.println();

        // Dynamic Polymorphism
        BankAccount sa = new SavingsAccount(2001, 10000.0);
        BankAccount ca = new CurrentAccount(2002, 20000.0);
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


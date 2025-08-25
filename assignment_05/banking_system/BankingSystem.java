package assignment_05.banking_system;

public class BankingSystem{
    public static void main(String[] args) {
        System.out.println(" Welcome to Banking System Simulation!\n");

        // STATIC POLYMORPHISM (Method Overloading)
        TransactionProcessor processor = new TransactionProcessor();
        processor.process(12345, 500.0);    // Deposit
        processor.process(12345, -200.0);   // Withdrawal
        processor.process(12345, 67890, 300.0);  // Transfer
        System.out.println();

        // DYNAMIC POLYMORPHISM (Method Overriding)

        SavingsAccount savings = new SavingsAccount(12345, "Ayla Balakumar", 10000.0);
        CurrentAccount current = new CurrentAccount(67890, "Benjamin Francis", 5000.0);

        savings.displaySavingsInfo();
        System.out.println();
        current.displayCurrentInfo();
        System.out.println();

        // Polymorphic array - same reference type, different objects
        BankAccount[] accounts = {savings, current};

        System.out.println("--- Interest Calculation ---");
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Account " + accounts[i].getAccountNumber() +
                    " Interest: Rs." + accounts[i].calculateInterest());
        }
        System.out.println();

        // INTERFACE STATIC METHODS

        // Call static method directly using interface name
        SecurityCheck.logAttempt("ayla123");
        SecurityCheck.logAttempt("benjamin456");
        SecurityCheck.logAttempt("chitra789");
        System.out.println();

        // INTERFACE DEFAULT METHODS
        System.out.print("Savings Account Security: ");
        savings.showSecurityStatus();  // Uses default method from interface

        System.out.print("Current Account Security: ");
        current.showSecurityStatus();  // Uses default method from interface
        System.out.println();

        // INTERFACE ABSTRACT METHODS

        // Test user verification
        boolean savingsAuth = savings.verifyUser("user", "pass");
        boolean currentAuth = current.verifyUser("user", "wrong");

        System.out.println("Savings Account Auth: " + (savingsAuth ? "SUCCESS" : "FAILED"));
        System.out.println("Current Account Auth: " + (currentAuth ? "SUCCESS" : "FAILED"));
        System.out.println();

        System.out.println("--- BANKING SYSTEM WORKFLOW  ---");

        // Step 1: Security check
        System.out.println("Step 1: Security Verification");
        SecurityCheck.logAttempt("alice123");
        savings.showSecurityStatus();

        if (savings.verifyUser("user", "pass")) {
            System.out.println("Authentication successful!");

            // Step 2: Process transactions
            System.out.println("\nStep 2: Processing Transactions");
            processor.process(12345, 1000.0);  // Deposit
            savings.setBalance(savings.getBalance() + 1000.0);

            processor.process(12345, 67890, 500.0);  // Transfer
            savings.setBalance(savings.getBalance() - 500.0);
            current.setBalance(current.getBalance() + 500.0);

            // Step 3: Calculate interests
            System.out.println("\nStep 3: Interest Calculation");
            BankAccount[] allAccounts = {savings, current};
            double totalInterest = 0;

            for (int i = 0; i < allAccounts.length; i++) {
                double interest = allAccounts[i].calculateInterest();
                totalInterest += interest;
                System.out.println("Account " + allAccounts[i].getAccountNumber() +
                        " - Interest: Rs." + interest);
            }

            System.out.println("Total Interest to be paid: Rs." + totalInterest);

            // Step 4: Account Status
            System.out.println("\nStep 4: Final Account Status");
            savings.displaySavingsInfo();
            current.displayCurrentInfo();

        } else {
            System.out.println(" Authentication failed!");
        }

        // POLYMORPHISM SUMMARY
        System.out.println("\n--- POLYMORPHISM CONCEPTS USED ---");
        System.out.println("Static Polymorphism: TransactionProcessor.process() - Method Overloading");
        System.out.println("Dynamic Polymorphism: BankAccount.calculateInterest() - Method Overriding");
        System.out.println("Interface Static Method: SecurityCheck.logAttempt() - Called via interface");
        System.out.println("Interface Default Method: SecurityCheck.showSecurityStatus() - Inherited by classes");

    }
}

public class IndustrySimulation {

    static class TransactionProcessor {
        public void process(int accountNumber, double amount) {
            System.out.println("Processing single-account transaction for acc #" + accountNumber
                    + " amount $" + amount);
        }

        public void process(int fromAccount, int toAccount, double amount) {
            System.out.println("Processing transfer from acc #" + fromAccount + " to acc #"
                    + toAccount + " amount $" + amount);
        }
    }

    static class BankAccount {
        protected int accountNumber;
        protected double balance;

        public BankAccount(int accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public double calculateInterest() {
            System.out.println("BankAccount.calculateInterest()");
            return balance * 0.01;
        }
    }

    static class SavingsAccount extends BankAccount {
        public SavingsAccount(int accountNumber, double balance) {
            super(accountNumber, balance);
        }

        @Override
        public double calculateInterest() {
            System.out.println("SavingsAccount.calculateInterest()");
            return balance * 0.04;
        }
    }

    static class CurrentAccount extends BankAccount {
        public CurrentAccount(int accountNumber, double balance) {
            super(accountNumber, balance);
        }

        @Override
        public double calculateInterest() {
            System.out.println("CurrentAccount.calculateInterest()");
            return balance * 0.01;
        }
    }

    interface SecurityCheck {
        static void logAttempt(String user) {
            System.out.println("SecurityLog: attempt by " + user);
        }

        default void showSecurityStatus() {
            System.out.println("Secure connection established");
        }

        boolean verifyUser(String username, String password);
    }

    static class SimpleAuthenticator implements SecurityCheck {
        @Override
        public boolean verifyUser(String username, String password) {
            return "admin".equals(username) && "password".equals(password);
        }
    }

    public static void main(String[] args) {
        TransactionProcessor tp = new TransactionProcessor();
        tp.process(1001, 250.00);
        tp.process(1001, 2002, 500.00);

        BankAccount a1 = new SavingsAccount(1001, 1000.00);
        BankAccount a2 = new CurrentAccount(2002, 2000.00);

        System.out.println("Interest for a1: $" + a1.calculateInterest());
        System.out.println("Interest for a2: $" + a2.calculateInterest());

        SecurityCheck.logAttempt("alice");

        SimpleAuthenticator auth = new SimpleAuthenticator();
        auth.showSecurityStatus();

        boolean ok = auth.verifyUser("admin", "password");
        System.out.println("Authentication result: " + ok);


    }
}

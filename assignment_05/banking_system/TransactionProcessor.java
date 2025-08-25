package assignment_05.banking_system;

class TransactionProcessor {
    // Static Polymorphism - (Method Overloading)
    public void process(int accountNumber, double amount) {
        if (amount > 0) {
            System.out.println("Processing deposit of Rs." + amount + " to account: " + accountNumber);
        } else {
            System.out.println("Processing withdrawal of Rs." + Math.abs(amount) + " from account: " + accountNumber);
        }
    }

    public void process(int fromAccount, int toAccount, double amount) {
        System.out.println("Processing transfer of Rs." + amount + " from account " + fromAccount + " to account " + toAccount);
    }
}
package Assignment5.IndustrySimulation;


public class TransactionProcess {
    public void process(int accountNumber, double amount) {
        System.out.println("Processed deposit of $" + amount + " to account " + accountNumber);
    }

    public void process(int fromAccount, int toAccount, double amount) {
        System.out.println("Transferred $" + amount + " from account " + fromAccount + " to account " + toAccount);
    }
}


public class TransactionProcessor {

    public void process(int accountNumber,double amount) {
        System.out.println("Processing Transaction for account number " + accountNumber +" of amount $" + amount);
    }
    public void process(int fromAccount,int toAccount,double amount){

        System.out.println("Transferred $" + amount + " from account " + fromAccount + " to account $" + toAccount);
    }
}

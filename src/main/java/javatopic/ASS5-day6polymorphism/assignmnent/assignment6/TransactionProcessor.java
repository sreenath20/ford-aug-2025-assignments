package javatopic.day6polymorphism.assignmnent.assignment6;

public class TransactionProcessor {
    void process(int accountNumber,double amount){
        System.out.println("Account Number:"+accountNumber+ "deposited"+amount+"successfully");

    }
    void process(int fromAccount,int toAccount,double amount){
          System.out.println("Account "+fromAccount+" "+toAccount+" "+amount);

    }
}

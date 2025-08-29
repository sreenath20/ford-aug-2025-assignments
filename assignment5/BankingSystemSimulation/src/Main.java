//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TransactionProcessor processor = new TransactionProcessor();

        System.out.println();
        processor.process(1064736471, 500.0);             // deposit or withdrawal
        processor.process(946354720, 1064736471, 300.0);  // transfer

        System.out.println();

        // Dynamic Polymorphism
        BankAccount savings = new SavingsAccount(1064736471, 1000.0);
        BankAccount current = new CurrentAccount(946354720, 2000.0);
        savings.calculateInterest();
        System.out.println("------------------------------");
        current.calculateInterest();

        System.out.println();

        // Interface Static & Default Methods
        SecurityCheck.logAttempt("admin"); // Static method
        System.out.println();

        //verifying valid user or not by comparing username and password
        System.out.println("verifying for savings: ");
        System.out.println("given correct login credentials: "+ savings.verifyUser("admin","123456"));
        System.out.println("given incorrect login credentials: "+savings.verifyUser("admin","123"));
        System.out.println("---------------------------------------------------------");
        System.out.println("verifying for savings: ");
        System.out.println(" given correct login credentials: "+current.verifyUser("admin","12345"));
        System.out.println(" given incorrect login credentials: "+current.verifyUser("admin","123"));


    }
}
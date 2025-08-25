package assignment_03.online_banking_system;


// DOUBT - why is Invalid Deposit Amount! displayed everytime in Current Account Transactions




public class OnlineBankingSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Online Banking System!\n");

        System.out.println("--- Creating Savings Account ---");
        SavingsAccount savings = new SavingsAccount("SAV001", "Anil Kumar", 1000.0, 5.0);
        savings.displaySavingsInfo();
        System.out.println();

        System.out.println("--- Creating Current Account ---");
        CurrentAccount current = new CurrentAccount("CUR001", "Bob", 500.0, 1000.0);
        current.displayCurrentInfo();
        System.out.println();

        System.out.println("--- Savings Account Transactions ---");
        savings.deposit(200.0);
        savings.withdraw(150.0);
        savings.calculateInterest();
        savings.displaySavingsInfo();
        System.out.println();

        System.out.println("--- Current Account Transactions ---");
        current.deposit(300.0);
        current.withdraw(600.0);
        current.withdraw(500.0);
        current.displayCurrentInfo();
        System.out.println();
    }
}



package Assignment3.OnlineBankingSystem;

public class Driver {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("123", "Ram", 10000.0, 5.0);
        CurrentAccount current = new CurrentAccount("456", "Sam", 5000.0, 200.0);

        System.out.println("-----Savings Account-----");
        savings.deposit(200);
        savings.addInterest();
        savings.withdraw(100);
        savings.displayAccountDetails();

        System.out.println("-----Current Account-----");
        current.withdraw(600);
        current.displayAccountDetails();
    }
}

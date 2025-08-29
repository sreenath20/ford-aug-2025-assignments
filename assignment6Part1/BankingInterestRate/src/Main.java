//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Before Creating bank accounts:");
        BankAccount.displayInterestRate();

        //Creating bank accounts
        BankAccount account1 = new BankAccount(1234567, 2000.0);
        BankAccount account2 = new BankAccount(1234, 1000.0);
        BankAccount account3 = new BankAccount(9876, 5000.0);

        System.out.println("Bank accounts Information before any changes: ");
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        account3.displayAccountInfo();

        //updating interest Rate
        System.out.println("updating interest rate from 2.5% to 3.5%");
        System.out.println();
        BankAccount.updateInterestRate(3.5);

        //displaying new Bank information
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        account3.displayAccountInfo();

        //displaying Interest rate without an instance
        System.out.println("updating interest rate without creating an instance of BankAccount");
        BankAccount.displayInterestRate();
    }
}
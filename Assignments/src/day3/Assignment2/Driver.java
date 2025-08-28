package day3.Assignment2;

public class Driver {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("13A09", 3400.0, "Sam", 8.5);
        sa.deposit(2000);
        sa.calculateInterest();
        sa.withdraw(1000);
        System.out.println("----------------");
        CurrentAccount ca = new CurrentAccount("48B60", 8000.0, "B", 2000.0);
        ca.withdraw(4000);
        ca.withdraw(1500);
    }
}

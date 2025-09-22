package javatopic.day4_inheritance_encapsulation.assignments.assignment2;

public class Assignmnent2 {
    public static void main(String[] args) {
        Assignment2BankAccount p1=new Assignment2BankAccount(11111,10000.0,"kumar");
        p1.deposit(10000.0);
        p1.withdraw(2000.0);
        Assignment2SavingsAccount p2=new Assignment2SavingsAccount(11111,10000.0,"kumar",10.1);
        p2.display();

    }
}

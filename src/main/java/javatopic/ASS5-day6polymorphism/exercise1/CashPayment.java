package javatopic.day6polymorphism.exercise1;

public class CashPayment extends Payment{
    void processPayment(double amount) {
        System.out.println("Processing cash payment");
        System.out.println("Amount: "+amount);
    }

}

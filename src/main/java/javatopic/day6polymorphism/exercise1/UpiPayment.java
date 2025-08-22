package javatopic.day6polymorphism.exercise1;

public class UpiPayment extends Payment {
    void processPayment(double amount) {
        System.out.println("Processing UPI payment");
        System.out.println("Amount: "+amount);
    }

}

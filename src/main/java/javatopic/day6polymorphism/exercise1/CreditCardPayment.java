package javatopic.day6polymorphism.exercise1;

public class CreditCardPayment extends Payment {
    void processPayment(double amount) {

        System.out.println("Processing credit card payment");
        System.out.println("Amount: "+amount);
    }
}

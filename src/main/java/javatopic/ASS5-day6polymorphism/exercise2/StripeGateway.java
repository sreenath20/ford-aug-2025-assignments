package javatopic.day6polymorphism.exercise2;

public class StripeGateway implements PaymentGateway {
    public boolean processPayment(double amount){
        System.out.println("Processing payment via PayPal for amount"+amount);
        return true;
    }
}

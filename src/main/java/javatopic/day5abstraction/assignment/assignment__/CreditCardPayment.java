package javatopic.day5abstraction.assignment.assignment__;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(Double amount) {
        System.out.println("Payment method through CreditCardPayment");
    }
}

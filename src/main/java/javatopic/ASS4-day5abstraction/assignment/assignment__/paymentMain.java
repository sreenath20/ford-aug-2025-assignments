package javatopic.day5abstraction.assignment.assignment__;

public class paymentMain {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        payment1.pay(500.00);
        // Payment payment2 = new Payment() ; here the payment interface is abstract that is incomplete so we cannot instantiate it
        CreditCardPayment payment2 = new CreditCardPayment();
        payment2.pay(100.00);

        Payment payment3 = new upi();
        payment3.pay(1000.00);

       // payment3.displayDetails(); this is not possible as display details is the method of upi not method of payment

    }
}

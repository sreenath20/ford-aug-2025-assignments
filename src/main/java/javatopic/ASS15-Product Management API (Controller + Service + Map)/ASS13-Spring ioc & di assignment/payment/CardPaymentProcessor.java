package org.fooddelivery.payment;

import org.springframework.stereotype.Component;

@Component("cardPayment")
public class CardPaymentProcessor implements PaymentService {
    double amount;

    @Override
    public void processPayment(double amount) {
        System.out.println("Card payment process amount:"+amount);

    }

    public CardPaymentProcessor() {
        amount = 10.0;
    }
    public CardPaymentProcessor(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CardPaymentProcessor{" +
                "amount=" + amount +
                '}';
    }
}

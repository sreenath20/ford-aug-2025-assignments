package org.fooddelivery.payment;

import org.springframework.stereotype.Component;

@Component("upiPayment")
public class UPIPaymentProcessor implements PaymentService {

    private double amount;
    @Override
    public void processPayment(double amount) {
        System.out.println("UPI payment process amount:"+amount);
    }

    public UPIPaymentProcessor() {

    }
    public UPIPaymentProcessor(double amount) {
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
        return "UPIPaymentProcessor{" +
                "amount=" + amount +
                '}';
    }
}

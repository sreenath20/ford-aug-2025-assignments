package org.fooddelivery.order;

import org.fooddelivery.notification.NotificationService;
import org.fooddelivery.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("primeOrder")
public class PrimeOrderService implements OrderService {
    private String item;
    private double amount;

    private PaymentService paymentService;
    private NotificationService notificationService;

    @Autowired
    public PrimeOrderService(@Qualifier("smsNotification") NotificationService notificationService, @Qualifier("upiPayment") PaymentService paymentService) {
        this.notificationService = notificationService;
        this.paymentService = paymentService;
    }


    @Override
    public void placeOrder(String item, double amount) {
        this.item=item;
        this.amount=amount;
        System.out.println("------------------------------------------------------------------");
        System.out.println("PRIME ORDER SERVICE for"+item+"at rupees of "+amount);
        paymentService.processPayment(amount);
        notificationService.sendNotification("food order delivery");
        System.out.println("------------------------------------------------------------------");
    }

    public PrimeOrderService() {
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PrimeOrderService{" +
                "item='" + item + '\'' +
                ", amount=" + amount +
                '}';
    }
}

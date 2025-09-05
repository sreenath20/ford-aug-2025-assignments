package com.food_delivery.order;

import com.food_delivery.notification.NotificationService;
import com.food_delivery.payment.PaymentProcessor;
import org.springframework.core.annotation.Order;

public interface OrderService {

    void placeOrder(String item, Double amount);
}

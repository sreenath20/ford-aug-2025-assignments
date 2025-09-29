package com.fooddelivery.order;

import com.fooddelivery.notification.NotificationService;
import com.fooddelivery.payment.PaymentService;
import org.springframework.core.annotation.Order;

public interface OrderService {

    void placeOrder(String item, Double amount);
}

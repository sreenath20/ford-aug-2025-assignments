package org.fooddelivery.order;

import org.fooddelivery.notification.NotificationService;
import org.fooddelivery.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("normalOrder")
public class NormalOrderService implements OrderService {
    private String item;
    private double amount;

  //field injection
    @Autowired
  @Qualifier("cardPayment")
  private PaymentService paymentService;

    @Autowired
  @Qualifier("emailNotification")
  private NotificationService notificationService;


  public NormalOrderService() {

  }


  //constructor dependency injection
//@Autowired
//  public NormalOrderService( @Qualifier("cardPayment") PaymentService paymentService, @Qualifier("emailNotification") NotificationService notificationService) {
//      this.paymentService = paymentService;
//      this.notificationService = notificationService;
//  }

    @Override
    public void placeOrder(String item, double amount) {
        this.item=item;
        this.amount=amount;
        System.out.println("--------------------------------------------------------------------");
        System.out.println("NORMAL ORDER PLACED for "+item+"at rupees of "+amount);
        paymentService.processPayment(amount);
        notificationService.sendNotification("food order delivery");
        System.out.println("---------------------------------------------------------------------");

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
        return "NormalOrderService{" +
                "item='" + item + '\'' +
                ", amount=" + amount +
                '}';
    }
}

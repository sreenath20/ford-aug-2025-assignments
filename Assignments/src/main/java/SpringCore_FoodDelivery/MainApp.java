package SpringCore_FoodDelivery;

import org.fooddelivery.config.AppConfig;
import org.fooddelivery.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        System.out.println("--- Online Food Delivery Application ---");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //Normal Order
        OrderService normalOrder = (OrderService) context.getBean("normalorder");
        normalOrder.placeOrder("Paneer Biryani", 250);
        System.out.println();


        //Prime Order
        OrderService primeOrder = (OrderService) context.getBean("primeorderservice");
        primeOrder.placeOrder("Corn&Cheese Pizza", 350);


    }



}
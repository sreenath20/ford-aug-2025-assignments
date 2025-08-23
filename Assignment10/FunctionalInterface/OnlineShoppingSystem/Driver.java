package Assignment10.FunctionalInterface.OnlineShoppingSystem;

import java.util.Random;
import java.util.function.*;

public class Driver {
    public static void main(String[] args) {
        //predicate
        Predicate<Integer> qualityCheck=(orderAmount)->orderAmount > 2000;
        System.out.println("Order Qualifies for free shipping :"+qualityCheck.test(10000));
        //Consumer
        Consumer<Double> consumerAmount=(amount)-> System.out.println("Order Placed Successfully for amount :"+amount);
        consumerAmount.accept(1000.0);
        //Supplier
        Supplier<String> couponSupplier=() -> {
            Random random=new Random();
            return "SAVE"+random.nextInt(1000);
        };
        String coupon=couponSupplier.get();
        System.out.println("Your Coupon Code is:"+coupon);
        //Function
        Function<Double,Double> conversion=(usDollar)->usDollar*83;
        System.out.println("The Conversion of Dollar to rupees is: "+conversion.apply(5.0));
        //BiFunction
        BiFunction<Double,Double,Double> finalPrice=(price,discount)->price-(price*discount/100);
        System.out.println("The price After Discount is :"+finalPrice.apply(1000.0,10.0));


    }
}

package com.demo.Assignment10;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        List<Double> ordersUSD = Arrays.asList(50.0, 150.0, 300.0);

        Function<Double,Double> Conversion=(Double Amount)->Amount*83;
        Consumer<Double> conformation=(Double Amount)-> System.out.println("Order placed successFully for Rs"+Amount);
        Predicate<Double> freeShipping=(Double amount)->{
            if(amount*83>2000){
                System.out.println("Free shipping available");
            }
            return true;
        };
        Supplier<String> coupon_code=()-> "Save123";
        BiFunction<Double,Double,Double> percentageDiscount=(Double price,Double discount)->{
            return price-(price*discount/100);
        };
        for(Double item:ordersUSD){
            System.out.println("convert to IND"+Conversion.apply(item));
            freeShipping.test(item);
            conformation.accept(item);
            System.out.println("Coupon Code"+coupon_code.get());
            System.out.println(percentageDiscount.apply(item,20.0));
            
        }










    }
}

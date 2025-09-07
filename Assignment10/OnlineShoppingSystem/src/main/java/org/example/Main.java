package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Double> ordersUSD = Arrays.asList(50.0,150.0,300.0);

        // Function
        Function<Double,Double> convertToINR = usd -> usd * 83;

        //Predicate
        Predicate<Double> detectOrders = usd -> usd > 2000.0;

        //Consumer
        Consumer<Double> printMessage = amount -> System.out.println("Order confirmed for amount: "+ amount);

        //Supplier
        Supplier<String> couponCodeGenerator = () ->{
            Random random = new Random();
            int code=100+random.nextInt(900);
            return "Save" + code;
        };

        //BiFunction
        BiFunction<Double,Double,Double> finalPrice = (price,discount) -> price - (price * discount/100);

        //implementation

        Double discountPercentage = 10.0;
        for(Double price: ordersUSD){

//            converting USD to INR
            Double inrAmount = convertToINR.apply(price);

//            printing order confirmation
            printMessage.accept(inrAmount);

//            checking for free shipping
            if(detectOrders.test(inrAmount)){
                System.out.println("This order eligible for free shipping!!");
            }
            else{
                System.out.println("This order not eligible for free shipping!!");
            }


//            generating and printing coupon code
            String couponCode = couponCodeGenerator.get();
            System.out.println("your coupon code is "+couponCode);

//            apply discount
            Double totalprice= finalPrice.apply(inrAmount,discountPercentage);
            System.out.println("Final price after "+discountPercentage+"% discount is "+totalprice);
            System.out.println("---------------------------------------------");
        }
    }
}
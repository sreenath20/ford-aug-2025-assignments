package com.harini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class LambdaExercise {
    public static  void main(String[] args) {

        //Exercise1: Using Predicate
        List<Integer> scores = Arrays.asList(45, 78, 90, 32, 60, 85);
        Predicate<Integer> highScores = (score)->score>=50;
        System.out.print("The high scores are: ");
        for(Integer score:scores){
            if(highScores.test(score))
                System.out.print(score+" ");
        }
        System.out.println();

        //Exercise2: Using Consumer
        List<Double> transactions = Arrays.asList(5000.0, 15000.0, 25000.0, 8000.0);
        Predicate<Double> isLarge = (score)->(score>10000);
        Consumer<Double> largeValue = (score)-> System.out.println("ALLERT! Large transaction detected: "+score);
        for(Double score:transactions){
            if(isLarge.test(score))
                largeValue.accept(score);
        }

        //Exercise3: Using Supplier
        Integer pin1 = 2345 ;
        Integer pin2 = 1256 ;
        Integer pin3 = 4178 ;
        Supplier<Integer> pinSupply = ()->pin1;
        Supplier<Integer> pinSupply2 = ()->pin2;
        Supplier<Integer> pinSupply3 = ()->pin3;
        System.out.println("The three pins are: "+pinSupply.get()+" "+pinSupply2.get()+" "+pinSupply3.get());

        //Exercise4: Use Function
        List<Double> usdAmounts = Arrays.asList(10.0, 25.5, 100.0);
        List<Double> inrAmounts = new ArrayList<>();
        Function<Double,Double> usdToInr = (usd)->usd*87.09;
        for(Double usd:usdAmounts){
            inrAmounts.add(usdToInr.apply(usd));
        }
        System.out.println("The inr amounts are: "+inrAmounts);

        //Exercise5: BiFunction
        BiFunction<Double,Double,Double> calculateDiscount = (originalPrice,discountPercentage)->originalPrice - (originalPrice * discountPercentage / 100);
        System.out.println("The discounted price for 25000 of 20% off is "+calculateDiscount.apply(25000.0,20.0));
    }
}

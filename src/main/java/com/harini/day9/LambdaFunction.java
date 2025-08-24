package com.harini.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.*;

public class LambdaFunction {
    public static void main(String[] args) {
        Consumer<String> consumeName = (name)-> System.out.println(name);
        consumeName.accept("Harini");


        Supplier<Integer> supplyPrice = ()->32;
        System.out.println(supplyPrice.get());

        //Predicate is like anytime you want to check a condition or testing as it return boolean
        Predicate<Integer> predicateEven = (number)->number % 2 == 0;
        System.out.println(predicateEven.test(12));


        Function<String,Integer> stringLength = (name)->name.length();
        System.out.println(stringLength.apply("Swasthika Lakshmi Priya"));

        //BiFunction accepts two inputs and return one, so totally take 3 arguments
        BiFunction<Integer,Integer,Double> value = (base,power)-> Math.pow(base,power);
        System.out.println(value.apply(20,3));


    }
}

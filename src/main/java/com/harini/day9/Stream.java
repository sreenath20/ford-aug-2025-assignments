package com.harini.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Stream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Harini","Meena","Bindusri");
        //MAP API - transform the data since it's of Function interface
        //forEach is like the terminator since it returns nothing ,it's of Consumer interface
        names.stream().map((name)->name.length()).forEach((length)->System.out.println(length));

        //mapToInt has some methods like sum(), min(), max()
        Integer sum = names.stream().mapToInt((name)->name.length()).sum();
        System.out.println(sum);


        OptionalInt min1 = names.stream().mapToInt((name)->name.length()).min();
        //since min returns OptionalInt where Option is like a container
        if(min1.isPresent()){
            System.out.println(min1.getAsInt());
        }
        else {
            System.out.println("It is empty");
        }

        //toList converts the stream into list
        List<Integer> lengths = names.stream().map((name)->name.length()).toList();
        System.out.println(lengths);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(23);
        numbers.add(34);
        numbers.add(65);
        numbers.add(18);

        //filter is a predicate interface so it performs conditions and only those pass that condition are passed onto the next operation
        numbers.stream().filter((number)->number%2==0).forEach((number)-> System.out.println(number));
        System.out.println("\n-------------------\n");

        // sorted() sorts the streams but the original list remain unaffected
        numbers.stream().sorted().forEach((number)->System.out.println(number));
        // this does not modify the original numbers list
        System.out.println("Numbers list is not sorted "+numbers);

        // find the square of all the numbers in the numbers list
        numbers.stream().map((number)->Math.pow(number,2)).forEach((number)-> System.out.println(number));

    }
}

package com.harini.day5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Vehicle car = new Car("Mustang",1500000.0);
//        Vehicle bike = new Bike("Royal Enfield",1000000.0);
//        System.out.println("---------------Car Details---------------");
//        car.displayDetails();
//        car.start();
//        System.out.println("---------------Bike Details---------------");
//        bike.displayDetails();
//        bike.start();
        List<Integer> seats = new ArrayList<>();
        seats.add(51);
        seats.add(23);
        seats.add(13);
        seats.add(24);
        Collections.sort(seats);
        System.out.println(seats);

    }
}

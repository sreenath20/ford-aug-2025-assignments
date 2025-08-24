package com.harini.assignment6_2.Question2;

public class CheckOut {
    public void calculateTotal(double price,int quantity){
        if(quantity<=0 || price<=0){
            throw new IllegalArgumentException();
        }
        System.out.println( "The total amount is "+(price*quantity));
    }
}

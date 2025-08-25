package com.demo.Assignment_6_2;

import java.util.Scanner;

public class E_commerce {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double price =Double.parseDouble(sc.nextLine());
        int quantity=Integer.parseInt(sc.nextLine());
        Checkout checkout=new Checkout();
        try{
            System.out.println(checkout.calculateTotal(price,quantity));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class Checkout{
    double calculateTotal(Double price,int quantity)throws Exception{
        if(price<=0||quantity<=0){
            throw new IllegalArgumentException("Illegal input value");
        }
        return price*quantity;
    }
}

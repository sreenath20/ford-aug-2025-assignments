package com.harini.assignment5.Question2;

public class Main {
    public static void main(String[] args) {
//        DiscountCalculation dc = new DiscountCalculation();
//        System.out.println(dc.calculateDiscount(10000));
//        System.out.println(dc.calculateDiscount(10000,0.25));
//        System.out.println(dc.calculateDiscount(10000,0.5,true));
        Payment payment =new CreditCardPayment();
        payment.paymentProcess(500);
        Payment payment2 =new UPIPayment();
        payment2.paymentProcess(289.09);
//        Payment payment3 =new CashPayment();
//        payment3.paymentProcess(2890.09);
    }
}

package com.demo.Assignment5;

public class driver {
    public static  void main(String args[]){
//        int[] arrya={2,3,4,5};
//        MathOperation mathOperation=new MathOperation();
//        System.out.println(mathOperation.add(2,3));
//        System.out.println(mathOperation.add(3.5,4.5));
//        System.out.println(mathOperation.add(arrya));


//        CreditCardPayment creditCardPayment = new CreditCardPayment();
//        creditCardPayment.processPayement(456.344);
//        UpiPayment upiPayment = new UpiPayment();
//        Payement p1;
//        p1=new UpiPayment();
//        p1.processPayement(456.344);
//        p1.processPayement(343.34);

        RegularCustomer regularCustomer=new RegularCustomer();
        regularCustomer.calculateDiscount(500);
        regularCustomer.calculateDiscount(500,2);
        PremiumCustomer premiumCustomer=new PremiumCustomer();
        premiumCustomer.calculateDiscount(600);
        premiumCustomer.calculateDiscount(600,2);

    }
}

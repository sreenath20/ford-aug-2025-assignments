package com.demo.Assignment5;

public class Payement {

    void processPayement(Double amount){
        System.out.println("You are using general payment:"+amount);
    }
}

class CreditCardPayment extends Payement{
    @Override
    void processPayement(Double amount){
        System.out.println("You are using credit card:"+amount);
    }
}
class UpiPayment extends Payement{
    @Override

    void processPayement(Double amount){

        System.out.println("You are using upi:"+amount);
    }
}

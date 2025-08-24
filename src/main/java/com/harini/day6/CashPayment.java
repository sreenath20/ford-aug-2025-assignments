package com.harini.day6;

import com.harini.assignment5.Question2.Payment;

public class CashPayment extends Payment {
    @Override
    public void paymentProcess(double amount) {
        System.out.println("Processing cash payment of "+amount);
    }
}

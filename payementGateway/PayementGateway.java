package com.payementGateway;
//interface excercise

interface paymentGateway{

    public static final String DEFAULT_CURRENCY="INR";
    public static final double TAX_RATE = 0.18;
    abstract boolean processPayment(double amount);
    default double applyTax(double amount) {
        return amount+(amount*TAX_RATE);
    }
    static boolean validateAmount(double amount) {
        if(amount>0){
            System.out.println("Valid amount True ");
            return true;
        }
        return false;
    }
}
class PayPalGateWay implements paymentGateway{
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing payment via payPal for amount: "+amount);
        return true;
    }
}
class StripeGateWay implements paymentGateway{
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing payment via Stripe for amount: "+amount);
        return true;
    }
}
class main{
    public static void main(String[] args){
        int amount =5000;
        System.out.println(paymentGateway.DEFAULT_CURRENCY);
        System.out.println(paymentGateway.TAX_RATE);
        if(paymentGateway.validateAmount(amount)){
            PayPalGateWay payPalGateWay=new PayPalGateWay();
            payPalGateWay.processPayment(amount);
            if(payPalGateWay.processPayment(amount)){
                payPalGateWay.applyTax(amount);
            }
            StripeGateWay stripeGateWay=new StripeGateWay();
            stripeGateWay.processPayment(amount);
            if(stripeGateWay.processPayment(amount)){
                stripeGateWay.applyTax(amount);
            }
        }
        else{
            System.out.println("Invalid amount");
        }
    }
}

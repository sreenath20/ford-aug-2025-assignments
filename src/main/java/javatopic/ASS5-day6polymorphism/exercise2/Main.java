package javatopic.day6polymorphism.exercise2;

import static javatopic.day6polymorphism.exercise2.PaymentGateway.validateAmount;
// interface excercise
public class Main {
    public static void main(String[] args) {
        boolean condition;
        PaymentGateway paymentGateway1;
        PaymentGateway paymentGateway2;
        paymentGateway1=new PayPalGateway();
        condition = validateAmount(-100.0);
        double taxAmount;
        // if condition is not assigned then warning: Result of 'PaymentGateway.validateAmount()' is ignored
        // here validateAmount is static so no obj creation
        System.out.println(condition);

        paymentGateway1.processPayment(0.0);
        taxAmount=paymentGateway1.applyTax(3000.0);
        System.out.println("TAX"+taxAmount);


        paymentGateway2=new StripeGateway();
        paymentGateway2.processPayment(2000.0);
        System.out.println("Default Currency:"+PaymentGateway.DEFAULT_CURRENCY);
        System.out.println("Tax Rate:"+PaymentGateway.TAX_RATE);



    }
}

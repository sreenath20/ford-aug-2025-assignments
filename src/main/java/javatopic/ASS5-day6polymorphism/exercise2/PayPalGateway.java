package javatopic.day6polymorphism.exercise2;

public class PayPalGateway implements PaymentGateway {
    public boolean processPayment(double amount){
        System.out.println(" Processing payment via PayPal for amount"+amount);
        return true;
    }
   // @Override
    //public double applyTax(double amount){
      //  return amount*0.022;
    // }
}

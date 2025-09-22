package javatopic.day6polymorphism.exercise2;

public interface PaymentGateway {
    String DEFAULT_CURRENCY = "INR";
    Double TAX_RATE=0.18; // here implicitly access is public static final


    // abstract method
    boolean processPayment(double amount);

    //default method   if default is not written then Interface abstract methods cannot have a body
     default double applyTax(double amount) {
        return amount+(amount*TAX_RATE);
    }

    //static method  here abstarct method cannot have body we declare a body here so method is static
     static boolean validateAmount(double amount) {
        if(amount>0){
            return true;
        }
        else{
            return false;
        }
    }
}

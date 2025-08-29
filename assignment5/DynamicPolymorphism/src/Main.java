//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //creditcard payment object reference type Payment
        Payment creditCardPayment= new CreditCardPayment();
        creditCardPayment.processPayment(100.0);
        //upi payment object is created reference type Payment
        Payment upipay=new UPIPayment();
        upipay.processPayment(500.0);

    }
}
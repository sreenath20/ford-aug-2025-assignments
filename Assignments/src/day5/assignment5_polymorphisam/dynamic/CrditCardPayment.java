package day5.assignment5_polymorphisam.dynamic;

public class CrditCardPayment extends Payment {
    @Override
    public void processPayment(){
        System.out.println("Processing Credit Card Payment");
    }
}

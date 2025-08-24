package day5.assignment5_polymorphisam.dynamic;

public class Driver {
    public static void main(String[] args) {

        CrditCardPayment card=new CrditCardPayment();
        card.processPayment();

        UpiPayment up=new UpiPayment();
        up.processPayment();


    }
}

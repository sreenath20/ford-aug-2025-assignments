package day5.assignment5_polymorphisam.dynamic;

public class UpiPayment extends Payment{
    @Override
    public void processPayment(){
        System.out.println("Processing UPI Payment");
    }
}

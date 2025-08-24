package day5.Assignment2;

public class UPIPayment extends Payment{
    @Override
    public void paymentProcess(double amount) {
        System.out.println("Processing upi payment of "+amount);
    }
}

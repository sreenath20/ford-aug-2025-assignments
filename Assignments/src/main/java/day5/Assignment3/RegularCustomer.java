package day5.Assignment3;

public class RegularCustomer extends Customer{
    @Override
    public void calculateDiscount(double purchaseAmount) {
        System.out.println("You are a regular customer so the discount is "+(purchaseAmount*0.10));
    }
}

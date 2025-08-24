package day5.assignment5_polymorphisam.staticAndDynamic;

public class Customer {
    public double calculateDiscount(double purchaseAmount){
        return purchaseAmount*0.05;
    }
    public double calculateDiscount(double purchaseAmount, int loyaltyPoints){
        double discount = purchaseAmount*0.05;
        discount=discount+loyaltyPoints;
        return discount;
    }


}

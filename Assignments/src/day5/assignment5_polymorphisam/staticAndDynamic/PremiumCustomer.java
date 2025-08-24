package day5.assignment5_polymorphisam.staticAndDynamic;

public class PremiumCustomer extends Customer {
    @Override
    public double calculateDiscount(double discount) {
        return discount*0.07;
    }


}

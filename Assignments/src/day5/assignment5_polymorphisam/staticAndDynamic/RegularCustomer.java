package day5.assignment5_polymorphisam.staticAndDynamic;

public class RegularCustomer extends Customer{
    @Override
    public double calculateDiscount(double discount) {
        return discount*0.05;
    }


}

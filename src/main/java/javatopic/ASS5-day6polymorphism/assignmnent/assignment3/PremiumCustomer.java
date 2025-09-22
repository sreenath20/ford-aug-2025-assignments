package javatopic.day6polymorphism.assignmnent.assignment3;

public class PremiumCustomer extends Customer {
    @Override
    void calculateDiscount(double amount){
        System.out.println("overridden by child 2 :discount amount :"+ amount);
    }

}

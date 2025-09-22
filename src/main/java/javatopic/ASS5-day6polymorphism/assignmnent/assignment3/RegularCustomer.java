package javatopic.day6polymorphism.assignmnent.assignment3;

public class RegularCustomer extends Customer{
    @Override
    void calculateDiscount(double amount){
        System.out.println("overridden by child 1 :discount amount "+ amount);
    }


}

package javatopic.day6polymorphism.assignmnent.assignment3;

public class Customer {
    void calculateDiscount(double amount){
        System.out.println("discount amount"+ amount);

    }

    void calculateDiscount(double amount, int loyaltyPoints){
        System.out.println("discount loyal amount"+ (amount+loyaltyPoints));
    }
    void display(){
        System.out.println("display");
    }

}

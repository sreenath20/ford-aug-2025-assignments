package javatopic.day6polymorphism.assignmnent.assignment2;

public class CreditCardPayment extends Payment{
    @Override
    void  processPayment(double amount){
        System.out.println("child class credit card amount"+ amount);
    }
}

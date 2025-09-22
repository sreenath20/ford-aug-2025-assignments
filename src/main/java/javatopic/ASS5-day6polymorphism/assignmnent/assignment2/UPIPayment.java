package javatopic.day6polymorphism.assignmnent.assignment2;

public class UPIPayment extends Payment{
    @Override
    void  processPayment(double amount){
        System.out.println("child class UPI amount"+ amount);
    }

}

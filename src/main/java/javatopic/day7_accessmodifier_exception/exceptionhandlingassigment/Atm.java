package javatopic.day7_accessmodifier_exception.exceptionhandlingassigment;

public class Atm {
    double balance=10000;
    void withdraw(double amount){
        if(amount>balance){
            throw new RuntimeException("Insufficient balance");
        }

    }
}

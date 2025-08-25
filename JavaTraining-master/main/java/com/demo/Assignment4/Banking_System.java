package com.demo.Assignment4;



public class Banking_System {
    public static void main(String[] args) {
        CarLoan car = new CarLoan();
        car.calculateEMI(50000,5.2,12);
        car.approveLoans();

        HomeLoan home = new HomeLoan();
        home.calculateEMI(60000,5.2,12);
        home.approveLoans();


    }
}
abstract class Loan{
    abstract void calculateEMI(double principal,double rate, int tenureMonths);
}
interface ApprovalProcess{
    void approveLoans();
}
class HomeLoan extends Loan implements ApprovalProcess{
    @Override
    void calculateEMI(double principal,double rate, int tenureMonths){
        System.out.println("Home lona EMI for $"+principal+" is $"+(rate*tenureMonths));
    }

    @Override
    public void approveLoans() {
        System.out.println("Home loan approved");
    }
}
class CarLoan extends Loan implements ApprovalProcess{
    @Override
    void calculateEMI(double principal,double rate, int tenureMonths){
        System.out.println("Car lona EMI for $"+principal+" is $"+(rate*tenureMonths));

    }
    public void approveLoans() {
        System.out.println("Car loan approved");
    }
}

